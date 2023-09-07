package net.servicestack.idea.sharpscript;

import com.intellij.lexer.FlexAdapter;

public class SharpScriptLexerAdapter extends FlexAdapter {
    public SharpScriptLexerAdapter() {
        super(new _SharpScriptLexer(null));
    }
}

