package net.servicestack.idea

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.vfs.VirtualFile
import com.jetbrains.rider.actions.base.RiderAnAction
import net.servicestack.idea.common.IDEAUtils
import net.servicestack.idea.common.INativeTypesHandler
import java.io.File

class AddRiderAction : RiderAnAction(
    "AddRiderAction",
    "ServiceStack Reference...",
    "Adds a ServiceStack reference to the selected module"), DumbAware {
    override fun actionPerformed(anActionEvent: AnActionEvent) {
        val contextFile:VirtualFile = anActionEvent.dataContext.getData("virtualFile") as VirtualFile
        val dir:String = if (contextFile.isDirectory) contextFile.path else contextFile.parent.path
        val module = anActionEvent.getData(LangDataKeys.MODULE)
        val dialog = AddRef(module,this,anActionEvent)
        dialog.pack()
        dialog.setLocationRelativeTo(null)
        dialog.size = dialog.preferredSize
        dialog.isResizable = true
        dialog.title = "Add ServiceStack Reference"
        dialog.selectedDirectory = dir

        val baseDir = File(dir)
        var count = 0;
        val maxWalk = 8;
        val projFile: File;
        while(true) {
            val projFiles = baseDir.listFiles { _, filename ->
                filename.endsWith(".csproj") ||
                        filename.endsWith(".vbproj") ||
                        filename.endsWith(".fsproj")
            } ?: emptyArray()

            if(projFiles.isNotEmpty()) {
                projFile = projFiles.first()
                break;
            }
            count++
            if(count >= maxWalk) {
                throw Exception("Unable to locate project file.")
            }
        }

        val projFileName = projFile.name

        val nativeTypeHandler: INativeTypesHandler =
            when {
                projFileName.endsWith(".csproj") -> CSharpNativeTypesHandler()
                projFileName.endsWith(".vbproj") -> VbNetNativeTypesHandler()
                projFileName.endsWith(".fsproj") -> FSharpNativeTypesHandler()
                else -> CSharpNativeTypesHandler()
            }

        dialog.setInitialDtoName(
            IDEAUtils.getInitialFileName(
                dir,
                nativeTypeHandler
            ))

        dialog.nativeTypesHandler = nativeTypeHandler
        dialog.isVisible = true
    }

    public fun dialogOk(e: AnActionEvent) {
        super.actionPerformed(e)
    }
}