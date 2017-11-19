pipeline {
  agent {
          docker { image 'node:jdk-8-alpine' }
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
