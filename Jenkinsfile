pipeline {
  agent {
          docker { image 'jenkins:alpine' }
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
