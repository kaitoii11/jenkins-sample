pipeline {
  agent {
          docker { image 'maven:alpine' }
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
