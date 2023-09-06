def call(String gitUrl, String credentialsId, String branch = 'master') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[url:https://github.com/ritesh107/common-shared-library.git]]
    ])
}
