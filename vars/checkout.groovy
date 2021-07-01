def call(String a){
 node {
    stage('Example') {

            git branch: 'dev', credentialsId: 'github-cred', url: 'https://github.com/mageshlinux/magesh-test.git'
         
        }
    }
}   
