[中文][1] | English

## Deploy SpringBoot Project In Azure Cloud

### Preparatory Work

1. Prepare a Microsoft Azure account.
2. Prepare SpringBoot project code, and push it to the new repository in GitHub.

### Deployment Process

1. Access the [Azure portal][2]
2. Click create resource button.![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/1.png)
3. Choose `Web App`, if not found, you can search `Web App` in the search bar. And click create.![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/2.png)
4. Create Web App. Create resource group-> Fill in the details-> Choose app server plan.![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/3.png)
5. Config continuous deployment. Choose the GitHub repository and branch to continuous deploy.![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/4.png)
6. Create app.![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/5.png)
7. Go to resources. ![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/6.png)
8. Enter the Actions page in the GitHub repository. Yellow indicates an ongoing task. Since I submitted the code twice, there are two deployment tasks in progress. Try to ensure that only one deployment task is running at the same time during use. When the run is successfully completed, it will be indicated by a green check mark, The following three are the tasks that were successfully deployed before. ![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/7.png)
9. After the deployment is successful, the URL in the upper right corner is the URL of the back-end service. ![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/8.png)

[1]:  https://github.com/ineedahouse/azure-test-back-end/blob/master/README.md
[2]: https://portal.azure.com/

