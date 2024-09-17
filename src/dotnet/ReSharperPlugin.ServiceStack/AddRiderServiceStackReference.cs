using JetBrains.Application.DataContext;
using JetBrains.Application.UI.Actions;
using JetBrains.Application.UI.ActionsRevised.Menu;
using JetBrains.Application.UI.ActionSystem.ActionsRevised.Menu;
using JetBrains.ProjectModel.DataContext;
using JetBrains.ProjectModel.NuGet.PackageManagement;
using JetBrains.ReSharper.Psi.Files;

namespace ReSharperPlugin.ServiceStack
{
    [Action("AddRiderServiceStackReference", "ServiceStack Reference...")]
    public class AddRiderServiceStackReference : IActionWithExecuteRequirement, IExecutableAction
    {
        public IActionRequirement GetRequirement(IDataContext dataContext)
        {
            return CommitAllDocumentsRequirement.TryGetInstance(dataContext);
        }

        public bool Update(IDataContext context, ActionPresentation presentation, DelegateUpdate nextUpdate)
        {
            return true;
        }

        public void Execute(IDataContext context, DelegateExecute nextExecute)
        {
            var nuGetNativePackageManager = context.GetComponent<NuGetNativePackageManager>();
            nuGetNativePackageManager.InstallLatestPackage(context.Projects().Project, "ServiceStack.Client");
        }
    }
}