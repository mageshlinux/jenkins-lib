pipeline{
    agent any
   
    stages{
        stage("Env Build Number"){
            steps{
                sh 'echo "The build number is ${env.BUILD_NUMBER}"'
                sh 'echo "You can also use \${BUILD_NUMBER} -> ${BUILD_NUMBER}"'
            }
        }
    }
}
