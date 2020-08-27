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
            steps {
               echo 'another branch'
            }
         }
      }
} 
    
   