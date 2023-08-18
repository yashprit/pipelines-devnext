## Pre-Requistes:
1. Fork this project to your Github Repo
2. Create a Token with the following permission.. Keep this token handy..
repo (all)
admin:repo_hook (read, write)
admin:public_key (read, write)
3. Join us on 22-Aug for session

## Integrations
JFrog Pipelines has a concept of Integrations. Integrations allows us to integrate with 2p / 3p tools like AWS, k8s, Github

### Configure SCM in JFrog Pipeline
1. Login to JFrog Platform
2. Admin > Pipeline > Integration > Add Integration
Name of Integration: <yourinitials>_github

## Pipeline Development Environment (PDE)
PDE is an IDE for JFrog Pipelines. Its being built with the focus to enable building pipelines easily. 
Given that its Alpha, each participant will have to enable it.

### Steps to Enable PDE
1. Login to JFrog Platform
2. F12 (Developer Tools) > Console > ```localStorage.setItem('PDE', true)```
3. Close the Developer Tools

## Pipeline Source
This steps is primairly to specify which repo has the YAML for the Pipelines which is being built.
1. Login to JFrog Platform
2. Admin > Pipeline > Integration > Add Integration

## Hands-On

#### Hands-On 1 : Add a Git Repo Resource to the Pipeline

#### Hands-On 2a : Add a step + task to do one of the below

#### Hands-On 2b [Bonus]: Run steps in Parallel

#### Hands-On 3 : Add a notification task on completion of Pipeline --> Slack Notify task at postRun()

#### Hands-On 4 : Trigger a Custom Run to perform deployment
