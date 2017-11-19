pipeline {
  agent {
          docker { image 'node:7-alpine' }
     }
  stages {
    stage('build') {
      steps {
        sh 'mvn compile'
      }
      steps {
        sh 'mvn test'
      }
    }
  }
}
