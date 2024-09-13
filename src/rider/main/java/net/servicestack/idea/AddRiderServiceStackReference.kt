package net.servicestack.idea

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.openapi.vfs.VirtualFile
import com.jetbrains.rider.actions.base.RiderAnAction
import net.servicestack.idea.common.IDEAUtils
import net.servicestack.idea.common.INativeTypesHandler
import java.io.File

class AddRiderServiceStackReference : RiderAnAction(
    "AddRiderServiceStackReference",
    "ServiceStack Reference...",
    "Adds a ServiceStack reference to the selected module"
) {
    override fun actionPerformed(e: AnActionEvent) {
        val contextFile = e.dataContext.getData(CommonDataKeys.VIRTUAL_FILE) as VirtualFile
        val dir: String = if (contextFile.isDirectory)
            contextFile.path
        else contextFile.parent.path

        val module = e.getData(LangDataKeys.MODULE)
        val dialog = AddRef(module, this, e)
        dialog.pack()
        dialog.setLocationRelativeTo(null)
        dialog.size = dialog.preferredSize
        dialog.isResizable = true
        dialog.title = "Add ServiceStack Reference"
        dialog.selectedDirectory = dir

        var baseDir = File(dir)
        var count = 0
        val maxWalk = 8
        val projFile: File
        while (true) {
            val projFiles = baseDir.listFiles { _, filename ->
                filename.endsWith(".csproj") ||
                        filename.endsWith(".vbproj") ||
                        filename.endsWith(".fsproj")
            } ?: emptyArray()

            if (projFiles.isNotEmpty()) {
                projFile = projFiles.first()
                break
            }
            count++
            if (count >= maxWalk) {
                throw Exception("Unable to locate project file.")
            } else {
                baseDir = baseDir.parentFile
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
            )
        )

        dialog.nativeTypesHandler = nativeTypeHandler
        dialog.isVisible = true
    }

    override fun update(e: AnActionEvent) {
        // Set visibility here
        e.presentation.isEnabledAndVisible = true
    }

    fun dialogOk(e: AnActionEvent) {
        super.actionPerformed(e)
    }
}