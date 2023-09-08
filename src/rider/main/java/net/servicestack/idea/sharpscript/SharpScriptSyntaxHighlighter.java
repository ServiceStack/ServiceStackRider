package net.servicestack.idea.sharpscript;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;

import static net.servicestack.idea.sharpscript.GeneratedTypes.*;


import org.jetbrains.annotations.NotNull;

public class SharpScriptSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Logger LOG = Logger.getInstance(SharpScriptSyntaxHighlighter.class);


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new SharpScriptLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        TextAttributesKey[] keys = null;
        LOG.info("getTokenHighlights called for tokenType: " + tokenType.toString());

        if (tokenType.equals(OPEN) || tokenType.equals(CLOSE)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.BRACKETS};
        }
        else if (tokenType.equals(OPEN_BLOCK) || tokenType.equals(CLOSE_BLOCK)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.BRACKETS};
        }
        else if (tokenType.equals(OPEN_PARTIAL)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.METADATA};
        }
        else if (tokenType.equals(COMMENT_OPEN) || tokenType.equals(COMMENT_CLOSE)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.LINE_COMMENT};
        }
        else if (tokenType.equals(OPEN_RAW_BLOCK) || tokenType.equals(CLOSE_RAW_BLOCK)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.BRACES};
        }
        else if (tokenType.equals(ID)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.CLASS_NAME};
        }
        else if (tokenType.equals(STRING)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.STRING};
        }
        else if (tokenType.equals(NUMBER)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.NUMBER};
        }
        else if (tokenType.equals(BOOLEAN)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.KEYWORD};
        }
        else if (tokenType.equals(DATA_PREFIX)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL};
        }
        else if (tokenType.equals(OPEN_SEXPR) || tokenType.equals(CLOSE_SEXPR)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.PARENTHESES};
        }

        if (keys == null) return new TextAttributesKey[0];
        return keys;
    }


}
