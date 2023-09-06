def call(String gitUrl, String branch = 'main') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: main]],
        userRemoteConfigs: [[https://github.com/ritesh107/common-shared-library.git]]
    ])
}
