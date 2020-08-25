pipeline {
    agent any
    stages {
      script {
       if(env.GIT_BRANCH =='origin/master' )
       echo env.GIT_BRANCH
        stage('Build') {
          steps {
        		 sh 'docker build -t israelfrank/learn_docker:latest .'
              sh 'docker login -u israelfrank -p 0533346872'
              sh 'docker push israelfrank/learn_docker:latest'
        }   
      }
    }
  }
}
