中文 | [English][1]

## 在Azure上部署SpringBoot后端项目

### 准备工作

1. 准备微软Azure账号
2. 准备后端代码，并上传到github上的新建仓库

### 部署过程

1. 进入[Azure门户网站][2]
2. 点击创建资源![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/1.png)
3. 选择Web App，如果没有找到，可以搜索，点击创建![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/2.png)
4. 创建Web应用，新建资源组->填写详细信息->选择应用服务计划![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/3.png)
5. 持续部署配置，选择需要持续部署的Github仓库及分支![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/4.png)
6. 创建应用![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/5.png)
7. 转到资源![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/6.png)
8. 进入Github仓库中的Actions页面，黄色的部分表示正在部署，由于我提交了两次代码所以有两个部署任务正在进行，在使用过程中尽量保证同一时间只有一个部署任务在运行。当运行顺利完成，则会以绿色的对号来表示，下面的三个是之前部署成功的任务![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/7.png)
9. 在部署成功后，右上角的URL就是后端服务的URL![image]( https://github.com/ineedahouse/markdownPhoto/blob/main/azure-deployment/back-end/8.png)

[1]:  https://github.com/ineedahouse/azure-test-back-end/blob/master/README_EN.md
[2]: https://portal.azure.com/

