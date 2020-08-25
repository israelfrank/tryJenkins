pipeline {
   agent any
   stages {
    stage('Build') {
      steps {
       script {
        echo env.GIT_BRANCH
        if(env.GIT_BRANCH =='origin/master' ) {
        		sh 'docker build -t israelfrank/learn_docker:latest .'
            sh 'docker push israelfrank/learn_docker:latest'
            sh 'docker login -u israelfrank -p 0533346872'
          }   
        }
       }
      }
     }
    }
  
