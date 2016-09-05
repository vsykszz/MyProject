branch = "master"
url = "https://github.com/vsykszz/MyProject.git"

freeStyleJob('configure-hostnames-sdp') {
    disabled(false)
    logRotator(numToKeep = 100)
    description 'this job is used to create agbot stack in a specific environment'
    parameters {
        labelParam("ENV"){
            defaultValue("devl")
            description('It should consist of {env}-{platform}. Eg, devl-linux, qual-linux etc')
        }
    }
    scm {
        git {
            remote {
                url('https://github.com/vsykszz/MyProject.git')
                branch('*/master')
            }
        }
    }
    steps {
    }
}