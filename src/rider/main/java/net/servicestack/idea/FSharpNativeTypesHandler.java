package net.servicestack.idea;

import net.servicestack.idea.common.BaseNativeTypesHandler;
import net.servicestack.idea.common.NativeTypesLanguage;

public class FSharpNativeTypesHandler extends BaseNativeTypesHandler {
    @Override
    public String getFileExtension() {
        return ".fs";
    }

    @Override
    public String getRelativeTypesUrl() {
        return "types/fsharp";
    }

    @Override
    public NativeTypesLanguage getTypesLanguage() {
        return NativeTypesLanguage.FSharp;
    }

    @Override
    public String getOptionsCommentStart() {
        return "(* Options:";
    }

    @Override
    public String getOptionsCommentEnd() {
        return "*)";
    }

    @Override
    public String getOptionsIgnoreFlag() {
        return "//";
    }
}
