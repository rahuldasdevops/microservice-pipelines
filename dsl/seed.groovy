def createDeploymentJob(jobName) {
    pipelineJob(jobName) {
        definition {
                scriptPath("Jenkinsfile")
            }
        }
    }
}
