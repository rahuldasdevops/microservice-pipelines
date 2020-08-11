def createDeploymentJob(jobName) {
    pipelineJob(jobName) {
    folder('non-prod') {
    displayName('non-prod')
    description('non-prod')
    }
    parameters {
        stringParam('APP', '', 'Application name')
        stringParam('EMAIL', 'admin@example.com', 'Associated email')
        stringParam('PROJECT', 'None', 'Git project associated with application')
        stringParam('GIT_REPO', 'None', 'The repository name to associate with application')
    }
        definition {
            cps{
               script(this.readFileFromWorkspace('project-a-workflow.groovy'))
               sandbox()
            }
        }
    }
}
createDeploymentJob(jobName)
