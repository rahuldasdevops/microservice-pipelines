def createDeploymentJob(jobName) {
    pipelineJob(jobName) {
    parameters {
        stringParam('APP', '', 'Application name')
        stringParam('EMAIL', 'admin@example.com', 'Associated email')
        stringParam('PROJECT', 'None', 'Git project associated with application')
        stringParam('GIT_REPO', 'None', 'The repository name to associate with application')
    }
        definition {
            cps{
                script{
                    @lib_
                    blah blah
                }
            }
        }
    }
}
createDeploymentJob(jobName)
