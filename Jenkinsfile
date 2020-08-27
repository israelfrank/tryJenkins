pipeline {
   agent any
      stages {
         stage('master') {
            when {
            branch 'master'            
            }
            steps {
               echo 'master'
            }
          }
               
         stage('branch'){
            when { 
               not { 
                  anyOf {
                     branch 'master';
                     branch 'kiki'
                  }       
               }
            }
            steps {
               echo 'another branch'
            }
         }
      }
} 
    
   