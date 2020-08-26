pipeline {
 agent any
   stages {
     stage('Build') {
       script{
         if (env.GIT_BRANCH == 'master') {
            steps {
               echo 'master'
            }
         }
         else {
            steps {
              echo 'branch' 
            } 
         }
      }
    }
  }
}
  
