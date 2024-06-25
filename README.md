# Ultimate Continuous Integration and Delivery <br> Using Jenkins Pipeline for Spring Boot Java Application <br> with Maven, SonarQube, Argo CD, and Kubernetes
---
### Here is the YouTube link for the complete project video -> https://youtu.be/78BcqoUciyg
---

![Ultimate CI-CD Pipeline Workflow](https://github.com/sourabh451/b/assets/134592493/156009d0-3d24-4310-9527-4441f6b197e6)

----
![Jenkins Architecture](https://github.com/sourabh451/b/assets/134592493/67d7ca72-38d0-4f2a-863a-18ce72736e99)

---
### Here are the step-by-step details followed in the above video to set up an Ultimate Continuous Integration and Continuous Delivery process using a Declarative Jenkins pipeline. This pipeline automates the entire CI/CD process for a Spring Boot Java application, from code checkout to production deployment. It uses popular tools like Maven, SonarQube, Docker, Argo CD, and Kubernetes:
```
1. Introduction:
   1.1 Introduction of complete CI/CD pipeline workflow.
   1.2 Introduction of Jenkins Architecture.

2. Building the simple spring boot java application using maven.

3. Build the Docker images which contains installation and configuration of maven and docker and Push
   it to the docker registry.

4. Add a Jenkinsfile and Dockerfile to the local repository of spring boot java application to define
   the pipeline stages:
   4.1 Define the declarative jenkins CI pipeline stages:
        Stage 1: Checkout the source code from Git.
        Stage 2: Build the Java application using Maven.
        Stage 3: Run SonarQube analysis to check the code quality.
        Stage 4: Package the application into a JAR file.
       Build a Dockerfile which copys the jar file from target directory and execute the jar file.
        Stage 5: Build and Push Docker Image of our application.
        Stage 6: Trigger the CD pipeline using jenkins REST_API.

5. Building the Application Manifest for kubernetes configuration:
   5.1 Creating deployment.yml file.
   5.2 Creating Jenkinsfile to update the deployment.yml file.
   5.3 Creating service.yml file.

6. Pushing the Source Code and Application Manifest to Github in two different repositaries.

7. Creating Amazon Elastic Compute Cloud i.e EC2 Instance in Amazon Web Service for running jenkins
   server, sonarqube server and install docker.

8. Install jenkins in EC2 instance for jenkins server.

9. Install the necessary Jenkins plugins in jenkins server:
   9.1 Git plugin
   9.2 Maven Integration plugin
   9.3 Pipeline plugin
   9.4 Kubernetes Continuous Deploy plugin

10. Create a new Jenkins CI pipeline:
    10.1 In Jenkins, create a new pipeline job and configure it with the Git repository URL for the
         Java application.
    10.2 Provide Path to Jenkinsfile which is in Git repository to define the pipeline stages.

11. Configure Jenkins pipeline:
    11.1 Use the Git plugin to check out the source code from the Git repository.
    11.2 Use the Docker Pipeline plugin which allows building, testing, and using Docker images from
         jenkins pipeline projects.
    11.3 Use the Docker images which contains installation and configuration of maven and docker to
         build and package the Java application and package into a JAR file.
    11.4 Use the SonarQube scanner plugin to analyze the code quality of the Java application.
    11.5 Use the Docker images which contains installation and configuration of docker to Build and
         Push Docker Image of our application.

12. Set up SonarQube.
    12.1 Install and Configure SonarQube on EC2 Instance.
    12.2 Log In to SonarQube server and generate token to authenticate SonarQube in Jenkins

13. To Configure Jenkins pipeline to integrate with SonarQube Add the SonarQube token to Jenkins
    credentials.

14. Set up Docker.
    14.1 Install and Configure Docker on EC2 Instance.
    14.2 Add the Docker Hub credentials to Jenkins credentials.

15. To Configure Jenkins pipeline to integrate with GitHub Add the GitHub Personal access token to
    Jenkins credentials.

16. Create a new Jenkins CD pipeline:
    16.1 In Jenkins, create a new pipeline job and configure it with the Git repository URL for the
         Application Manifest, Add Parameter and Build Trigger.
    16.2 Provide Path to Jenkinsfile which is in Git repository to define the pipeline stages.

17. To Trigger Jenkins CD pipeline, Add the Jenkins API Token to Jenkins credentials.

18. Set up Kubernetes:
    18.1 Install and Configure Minikube, that allows us to run Kubernetes locally.
    18.2 Install and Configure Kubectl to communicate with kubernetes cluster control plane using
         kubernetes API. 
    
19. Set up Argo CD:
    19.1 Install Argo CD on the Kubernetes cluster using kubernetes operator.
    19.2 Create and apply an Argo CD controller by creating a YAML file that contains the basic
         configuration defining an Argo CD instance with minimal setup in a Kubernetes cluster.

20. Run the Jenkins pipeline:
    20.1 Trigger the Jenkins pipeline to start the CI/CD process for the Java application.
    20.2 Monitor the pipeline stages and fix any issues that arise.

21. In Argo CD server create application and configure Git repository URL to Application Manifest for
    Argo CD to track the changes in the Kubernetes manifests and deploy to kubernetes cluster.

22. Configure a webhook to notify Jenkins when changes are pushed to the GitHub repository.
```
