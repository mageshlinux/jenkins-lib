pipeline{
    agent any
   
    stages{
        stage("Env Build Number"){
            steps{
            echo "current build number: ${currentBuild.number}"
                
            }
        }
    }
}
