package snaatak.common

def call(String repoUrl = 'https://github.com/RishabhKishnatray/attendance-api.git', String credentialsId = 'shared', String branchName = 'main') {
       stage('Cloning Repo') {
        git branch: branchName, credentialsId: credentialsId, url: repoUrl
    }
}
