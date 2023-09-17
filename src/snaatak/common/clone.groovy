package snaatak.common

def call(String repoUrl = 'https://github.com/RishabhKishnatray/attendance-api.git', String branchName = 'main') {
       stage('Cloning Repo') {
        git branch: branchName, url: repoUrl
    }
}
