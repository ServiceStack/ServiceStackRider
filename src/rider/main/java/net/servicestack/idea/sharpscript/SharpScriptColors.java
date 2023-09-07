package net.servicestack.idea.sharpscript;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;

public class SharpScriptColors {
    public static final TextAttributesKey ARROW = TextAttributesKey.createTextAttributesKey(
            "SHARPSCRIPT.ARROW",
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PIPE = TextAttributesKey.createTextAttributesKey(
            "SHARPSCRIPT.PIPE",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
    );
    // ... more colors
}

