def call(args) {
node {
    stage('Example') {
      checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github-cred', url: 'https://github.com/mageshlinux/magesh-test.git']]])
    }
 }

}
