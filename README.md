## Pre-Requistes:
1. Fork this project to your Github Repo
2. Create a Token with the following permission.. Keep this token handy..
repo (all)
admin:repo_hook (read, write)
admin:public_key (read, write)
3. Join us on 22-Aug for session

## Integrations
JFrog Pipelines has a concept of Integrations. Integrations allows us to integrate with 2p / 3p tools like AWS, 
 which is primarily is
Configure SCM in JFrog Pipeline

1. Login to Public Github Account
2. Create a Token with the following Permission
repo (all)
admin:repo_hook (read, write)
admin:public_key (read, write)
3. Login to JFrog Platform
4. Admin > Pipeline > Integration > Add Integration

Fork Repo: https://github.com/jfrog/pipelines-devnext

Enable Pipeline Development Environment (PDE) : F12 > Console > localStorage.setItem('PDE', true)

Add YAML in JFrog Pipeline

1. Login to JFrog Platform
2. Admin > Pipeline > Pipeline Sources > Add Pipeline Source

Hands-On 1 : Add a Git Repo Resource to the Pipeline

resources:
  - name: src_repo
    type: GitRepo
    configuration:
      gitProvider: {{ .Values.var.gitProvider }}
      path: {{ .Values.var.path }}
      branches:
        include: {{ .Values.var.branches }}

Hands-On 2a : Add a step + task to do one of the below
--> Bash Step & Tasks - Java Gradle Build + Docker Build & Publish



--> Bash Step & Tasks - Npm Build + Docker Build & Publish 

Hands-On 2b [Bonus]: Run steps in Parallel

Hands-On 3 : Add a notification task on completion of Pipeline --> Slack Notify task at postRun()

Hands-On 4 : Trigger a Custom Run to perform deployment
