def call(String gitUrl, String branch = 'main') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: main]],
        userRemoteConfigs: [[[url:]]
    ])
}
