pipeline{
    agent any
   
    stages{
        stage("Env Build Number"){
            steps{
                println ${env.BUILD_NUMBER}
                
            }
        }
    }
}
