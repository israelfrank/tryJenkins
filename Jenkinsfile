pipeline {
   agent any
      stages {
         stage('master') {
            when {
               branch 'master' , 'kiki'      
            }
            steps {
               echo 'master'
            }
         }
         stage('branch'){
            branch ''
            steps {
               echo 'another branch'
            }
         }
      }
} 
    
   