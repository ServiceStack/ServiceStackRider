package net.servicestack.idea.sharpscript;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import net.servicestack.idea.PluginIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public final class SharpScriptFileType extends LanguageFileType {
    public static final SharpScriptFileType INSTANCE = new SharpScriptFileType();

    private SharpScriptFileType() {
        super(SharpScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "SharpScript";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "SharpScript language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ss";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return IconLoader.getIcon("/servicestack.svg", PluginIcons.class); // You can provide an icon here if you want
    }
}

