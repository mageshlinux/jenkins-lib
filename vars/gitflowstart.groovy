pipeline{
    agent any
   
    stages{
        stage("Env Build Number"){
            steps{
                println "$BUILD_NUMBER"
                
            }
        }
    }
}
