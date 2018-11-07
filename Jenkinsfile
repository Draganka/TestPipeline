pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Dragana'
      }
    }
    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            bat 'mvn test'
            echo 'Done!'
          }
        }
        stage('JMeter test parallel') {
          steps {
            bat 'ant -buildfile "build.xml"'
          }
        }
      }
    }
    stage('JMeter test') {
      steps {
        bat 'ant -buildfile "build.xml"'
      }
    }
  }
}