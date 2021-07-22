package net.servicestack.idea;

import net.servicestack.idea.common.BaseNativeTypesHandler;
import net.servicestack.idea.common.NativeTypesLanguage;

public class VbNetNativeTypesHandler extends BaseNativeTypesHandler {
    @Override
    public String getFileExtension() {
        return ".vb";
    }

    @Override
    public String getRelativeTypesUrl() {
        return "types/vbnet";
    }

    @Override
    public NativeTypesLanguage getTypesLanguage() {
        return NativeTypesLanguage.VbNet;
    }

    @Override
    public String getOptionsCommentStart() {
        return "' Options:";
    }

    @Override
    public String getOptionsCommentEnd() {
        // This might be a problem...
        return "\r\n";
    }

    @Override
    public String getOptionsIgnoreFlag() {
        return "'''";
    }
}
