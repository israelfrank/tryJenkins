pipeline {
 agent any
   stages {
     script{
       if (env.GIT_BRANCH == 'master') {
         stage('Build') {
            steps {
               echo 'master'
            }
         }
       } 
      else {
         stage('Build') {
            steps {
              echo 'branch' 
            } 
         }
      }
    }
  }
}
  
