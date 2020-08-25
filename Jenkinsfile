pipeline {
   agent any
   stages {
    stage('Build') {
      steps {
       script {
        if(env.GIT_BRANCH == 'master') {
          echo env.GIT_BRANCH
         }
        else if(env.GIT_BRANCH == 'kiki'){
            echo env.GIT_BRANCH
         }     
        }
       }
      }
     }
    }
  
