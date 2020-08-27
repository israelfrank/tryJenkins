pipeline {
   agent any
      stages {
         stage('master') {
            when {
             anyOf {
                  branch 'master'; branch 'kiki'
               }          
            }
            steps {
               echo 'master'
            }
          }
               
         stage('branch'){
            when { 
               not { 
                 branch 'master' 
               }
            }
            steps {
               echo 'another branch'
            }
         }
      }
} 
    
   