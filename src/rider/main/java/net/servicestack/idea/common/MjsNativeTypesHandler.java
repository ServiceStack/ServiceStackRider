package net.servicestack.idea.common;

import net.servicestack.idea.common.BaseNativeTypesHandler;
import net.servicestack.idea.common.NativeTypesLanguage;

public class MjsNativeTypesHandler extends BaseNativeTypesHandler {
    @Override
    public String getFileExtension() {
        return ".mjs";
    }

    @Override
    public String getRelativeTypesUrl() {
        return "types/mjs";
    }

    @Override
    public NativeTypesLanguage getTypesLanguage() {
        return NativeTypesLanguage.Mjs;
    }

    @Override
    public String getOptionsCommentStart() {
        return "/* Options:";
    }

    @Override
    public String getOptionsCommentEnd() {
        return "*/";
    }

    @Override
    public String getOptionsIgnoreFlag() {
        return "//";
    }
}
