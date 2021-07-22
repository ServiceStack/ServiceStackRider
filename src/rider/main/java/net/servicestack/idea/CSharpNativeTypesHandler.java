package net.servicestack.idea;

import net.servicestack.idea.common.BaseNativeTypesHandler;
import net.servicestack.idea.common.NativeTypesLanguage;

public class CSharpNativeTypesHandler extends BaseNativeTypesHandler {
    @Override
    public String getFileExtension() {
        return ".cs";
    }

    @Override
    public String getRelativeTypesUrl() {
        return "types/csharp";
    }

    @Override
    public NativeTypesLanguage getTypesLanguage() {
        return NativeTypesLanguage.CSharp;
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
