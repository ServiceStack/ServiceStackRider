package net.servicestack.idea;

import com.intellij.openapi.module.Module;
import com.intellij.util.PlatformUtils;

import net.servicestack.idea.common.*;

public class NativeTypeUtils {

    public static INativeTypesHandler getDefaultNativeTypesHandler(Module module) {
        return new CSharpNativeTypesHandler();
    }

    public static INativeTypesHandler getNativeTypesHandler(String fileName) {
        INativeTypesHandler result = null;
        if (fileName.endsWith(".cs")) result = new CSharpNativeTypesHandler();
        if (fileName.endsWith(".fs")) result =  new FSharpNativeTypesHandler();
        if (fileName.endsWith(".vb")) result = new VbNetNativeTypesHandler();
        if (fileName.endsWith("dtos.ts")) result = new TypeScriptConcreteNativeTypesHandler();
        if (fileName.endsWith("dtos.d.ts")) result = new TypeScriptNativeTypesHandler();
        return result;
    }

    public static INativeTypesHandler getNativeTypesHandler(Module module, String fileName) {
        INativeTypesHandler defaultNativeTypesHandler = getDefaultNativeTypesHandler(module);
        INativeTypesHandler nativeTypesHandler = getNativeTypesHandler(fileName);
        if(nativeTypesHandler != null) {
            return nativeTypesHandler;
        }
        return defaultNativeTypesHandler;
    }
}
