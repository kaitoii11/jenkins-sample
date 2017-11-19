pipeline {
  agent {
          docker { image 'node:7-alpine' }
     }
  stages {
    stage('build') {
      steps {
        sh 'mvn compile'
        sh 'mvn test'
      }
    }
  }
}
