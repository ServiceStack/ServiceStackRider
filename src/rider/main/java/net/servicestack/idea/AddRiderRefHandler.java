package net.servicestack.idea;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFileManager;
import net.servicestack.idea.common.DialogErrorMessages;
import net.servicestack.idea.common.IDEAUtils;
import net.servicestack.idea.common.INativeTypesHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

public class AddRiderRefHandler {
    static boolean handleOk(Module module,
                         String addressUrl,
                         String fileName,
                         String selectedDirectory,
                         StringBuilder errorMessage) {
        File file = new File(selectedDirectory);
        INativeTypesHandler nativeTypesHandler = NativeTypeUtils.getNativeTypesHandler(fileName);

        String dtoPath = file.getAbsolutePath() + File.separator
                + IDEAUtils.getDtoFileName(fileName, nativeTypesHandler);
        List<String> codeLines = getDtoLines(addressUrl,nativeTypesHandler,errorMessage);

        if(codeLines == null) {
            return false;
        }

        if (!IDEAUtils.writeDtoFile(codeLines, dtoPath, errorMessage)) {
            return false;
        }

        //Analytics.SubmitAnonymousAddReferenceUsage(nativeTypesHandler);
        IDEAUtils.refreshFile(module,dtoPath, true);
        VirtualFileManager.getInstance().syncRefresh();



        return true;
    }

    private static List<String> getDtoLines(String addressUrl, INativeTypesHandler nativeTypesHandler,
                                            StringBuilder errorMessage) {
        List<String> codeLines;
        try {
            codeLines = nativeTypesHandler.getUpdatedCode(addressUrl, null);
            if (!codeLines.get(0).startsWith(nativeTypesHandler.getOptionsCommentStart())) {
                //Invalid endpoint
                errorMessage.append("The address url is not a valid ServiceStack endpoint.");
                return null;
            }
        } catch (URISyntaxException | MalformedURLException | FileNotFoundException e) {
            e.printStackTrace();
            DialogErrorMessages.appendInvalidEndpoint(errorMessage, addressUrl, e);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            DialogErrorMessages.appendReadResponseError(errorMessage, addressUrl, e);
            return null;
        }
        return codeLines;
    }
}
