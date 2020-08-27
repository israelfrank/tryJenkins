pipeline {
   agent any
      stages {
         stage('master') {
            when {branch 'master || kiki' }
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
    
   