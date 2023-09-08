package net.servicestack.idea.sharpscript;

import com.intellij.lang.Language;

public class SharpScriptLanguage extends Language {
    public static final SharpScriptLanguage INSTANCE = new SharpScriptLanguage();

    private SharpScriptLanguage() {
        super("SharpScript");
    }
}

