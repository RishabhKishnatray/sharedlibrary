package snaatak.common

def call( String repoUrl, String credentialsId, String branch ) {
       stage('Cloning Repo') {
        git branch: branch, credentialsId: credentialsId, url: repoUrl
    }
}
