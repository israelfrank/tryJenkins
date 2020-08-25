pipeline {
   agent any
   stages {
    stage('Build') {
      steps {
       script {
        if(env.GIT_BRANCH == 'master' ) {
          echo env.GIT_BRANCH
        		sh 'docker build -t israelfrank/learn_docker:latest .'
            sh 'docker push israelfrank/learn_docker:latest'
            sh 'docker login -u israelfrank -p 0533346872'
          }   
        }
       }
      }
     }
    }
  
