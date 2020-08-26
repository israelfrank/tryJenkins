pipeline {
   agent any
   stages {
      stage('mmm'){
        steps {
          script {
            if(env.GIT_BRANCH == 'master') {
             stage('Build 1') {
               echo env.GIT_BRANCH
             }
            }     
            else if(env.GIT_BRANCH == 'kiki') {
             stage('Build 2') {
               echo env.GIT_BRANCH

             }
            }     
            else {
             stage('Build 3') {
               echo env.GIT_BRANCH
               
             } 
            }
          }
       }
      }
   }
}   
