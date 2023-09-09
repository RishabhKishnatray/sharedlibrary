def call() {
pipeline {
    agent any
    tools {
        git 'Default'
        jdk 'java'
    }

    stages {
        stage('clean workspace') {
            steps {
                cleanWs()
            }
        }
        stage('git clone') {
            steps {
                sh 'git clone https://github.com/RishabhKishnatray/employee-api.git'
            }
        }
        stage('gitleaks') {
            steps {
            script {
                    sh 'wget https://github.com/zricethezav/gitleaks/releases/download/v7.0.2/gitleaks-linux-amd64 -O gitleaks'
                    sh 'chmod +x gitleaks'
                    sh 'sudo cp gitleaks /usr/local/bin/'
                }
            }
        }
            stage('run') {
            steps {
                sh '''
                cd employee-api
                 gitleaks detect -p . -v
                 '''
                }
            }
        }
    }
}    

