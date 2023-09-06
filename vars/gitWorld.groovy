def call(String gitUrl, String credentialsId, String branch = 'main') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: main]],
        userRemoteConfigs: [[url:https://github.com/ritesh107/common-shared-library.git]]
    ])
}
