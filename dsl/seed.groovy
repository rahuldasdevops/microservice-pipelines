def createDeploymentJob(jobName) {
    pipelineJob(jobName) {
        definition {
             cpsScm {
                scriptPath("Jenkinsfile")
            }
        }
    }
}
