def call(args){
    pipeline {
        agent any 
        stages { 
            stage('Build') {
                steps {
                    echo 'build'
                }
            }
            stage('test') {
                steps {
                    echo 'test'
                }
            }
            stage('scan') {
                steps {
                    echo 'scan'
                }
            }
            stage('artifact') {
                steps {
                    echo 'artifact'
                }
            }
        }
    }
}
