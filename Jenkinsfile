pipeline {
   agent any
      stages {
         stage('master' , 'kiki') {
            when {
               branch 'master'      
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
    
   