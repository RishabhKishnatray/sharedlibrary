package snaatak.common

def call()
stage ('Poetry & Dependency'){
            steps {
                sh 'sudo apt update'                    
                sh 'sudo apt install openjdk-17-jre -y'
                sh 'sudo apt install software-properties-common'
                sh 'sudo add-apt-repository ppa:deadsnakes/ppa -y'
                sh 'sudo apt install python3.11 -y '
                sh 'sudo update-alternatives --install /usr/bin/python python /usr/bin/python3.11 1'
                sh 'sudo apt install python3.11-dev python3.11-venv python3.11-distutils python3.11-gdbm python3.11-tk python3.11-lib2to3 -y'
                sh 'sudo apt install python3-pip -y'
                // sh 'sudo pip3 install poetry'
                // sh 'poetry install'
                // sh 'poetry update'
            }
        }
