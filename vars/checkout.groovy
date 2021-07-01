def call(args){
    pipeline {
        agent any 
        stages { 
            stage('checkout') {
                steps {
                    git branch: 'dev', credentialsId: 'github-cred', url: 'https://github.com/mageshlinux/magesh-test.git'
                }
            }
	}	
    }
}
