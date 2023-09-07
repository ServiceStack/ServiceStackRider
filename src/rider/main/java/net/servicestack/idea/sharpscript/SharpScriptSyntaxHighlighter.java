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

        if (tokenType.equals(FAT_ARROW)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.OPERATION_SIGN};
        }
        else if (tokenType.equals(MUSTACHE_START) || tokenType.equals(MUSTACHE_END)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.BRACKETS};
        }
        else if (tokenType.equals(PIPE) || tokenType.equals(PIPE_CHAIN)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.SEMICOLON};
        }
        else if (tokenType.equals(IDENTIFIER)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.IDENTIFIER};
        }
        else if (tokenType.equals(NUMBER) || tokenType.equals(TRUE) || tokenType.equals(NULL)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.NUMBER};
        }
        else if (tokenType.equals(STRING)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.STRING};
        }
        else if (tokenType.equals(OBJECT_START) || tokenType.equals(OBJECT_END) ||
                tokenType.equals(ARRAY_START) || tokenType.equals(ARRAY_END)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.BRACES};
        }
        else if (tokenType.equals(TEMPLATE_START) || tokenType.equals(TEMPLATE_END)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.METADATA};
        }
        else if (tokenType.equals(EXPRESSION_TOKEN) || tokenType.equals(HASHTAG) ||
                tokenType.equals(OPEN_PAREN) || tokenType.equals(CLOSE_PAREN) ||
                tokenType.equals(OPEN_BRACE) || tokenType.equals(CLOSE_BRACE) ||
                tokenType.equals(ARROW) || tokenType.equals(SINGLE_QUOTE)) {
            keys = new TextAttributesKey[]{DefaultLanguageHighlighterColors.KEYWORD};
        }



        if (keys == null) return new TextAttributesKey[0];
        return keys;
    }

}
