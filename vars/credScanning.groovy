def call() {
    pipeline {
        agent any
        stages {
            stage('clean workspace') {
                steps {
                    cleanWs()
                }
            }
            stage('git clone') {
                steps {
                    script {
                         git branch: 'main', url: 'https://github.com/RishabhKishnatray/employee-api.git'
                    }
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
                    sh 'gitleaks detect -p . -v'
                }
            }
        }
    }
}
