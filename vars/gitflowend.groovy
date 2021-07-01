def call(args){
pipeline{
    agent any
   
    stages{
        stage("Merge"){
            steps{
              sh "cd $workspace/shared-library-pipeline"
              sh "git merge dev"
            }
        }
    }
  }
}
