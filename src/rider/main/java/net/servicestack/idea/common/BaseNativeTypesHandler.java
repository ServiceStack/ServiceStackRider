package net.servicestack.idea.common;

import net.servicestack.idea.common.INativeTypesHandler;
import org.apache.http.client.utils.URIBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class BaseNativeTypesHandler implements INativeTypesHandler {

    @Override
    public List<String> getUpdatedCode(String baseUrl, Map<String, String> options) throws IOException, URISyntaxException {
        String url;
        List<String> javaCodeLines = new ArrayList<String>();
        URIBuilder urlBuilder = this.getUrl(baseUrl);
        if(options != null) {
            for(Map.Entry<String, String> option : options.entrySet()) {
                urlBuilder.addParameter(option.getKey(),option.getValue());
            }
        }

        url = urlBuilder.build().toString();

        URL serviceUrl = URI.create(url).toURL();
        URLConnection javaResponseConnection = serviceUrl.openConnection();
        BufferedReader javaResponseReader = new BufferedReader(
                new InputStreamReader(
                        javaResponseConnection.getInputStream()));
        String metadataInputLine;

        while ((metadataInputLine = javaResponseReader.readLine()) != null)
            javaCodeLines.add(metadataInputLine);

        javaResponseReader.close();

        return javaCodeLines;
    }

    @Override
    public URIBuilder getUrl(String baseUrl) throws MalformedURLException, URISyntaxException {
        String serverUrl = baseUrl.endsWith("/") ? baseUrl : (baseUrl + "/");
        serverUrl = (serverUrl.startsWith("http://") || serverUrl.startsWith("https://")) ? serverUrl : ("http://" + serverUrl);
        URL url = URI.create(serverUrl).toURL();
        String path = url.getPath().contains("?") ? url.getPath().split("\\?", 2)[0] : url.getPath();
        if (!path.endsWith(this.getRelativeTypesUrl() + "/")) {
            serverUrl += (this.getRelativeTypesUrl() + "/");
        }
        serverUrl = toParentPath(serverUrl);
        URIBuilder builder;

        try {
            builder = new URIBuilder(serverUrl);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            throw e;
        }
        return builder;
    }

    public static String toParentPath(String path) {
        int pos = path.lastIndexOf("/");
        if (pos == -1) return "/";
        return path.substring(0, pos);
    }

    @Override
    public String getLanguageUrlName() {
        return this.getRelativeTypesUrl().substring(6);
    }
}
