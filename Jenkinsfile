pipeline {
   agent any
   stages {
    stage('Build') {
      script {
       if(env.GIT_BRANCH =='origin/master' ) {
         echo env.GIT_BRANCH
          steps {
        		sh 'docker build -t israelfrank/learn_docker:latest .'
            sh 'docker push israelfrank/learn_docker:latest'
            sh 'docker login -u israelfrank -p 0533346872'
          }   
        }
       }
      }
     }
    }
  
