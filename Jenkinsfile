pipeline {
  agent any
  stages {
    stage('Start') {
      steps {
        echo 'Start Execution.'
      }
    }
    stage('Parallel Execution') {
      parallel {
        stage('UI Test with Selenium') {
          steps {
            bat 'mvn test'
            echo 'Done!'
          }
        }
        stage('API Test with JMeter') {
          steps {
            bat 'ant -buildfile "build.xml"'
            echo 'Done!'
          }
        }
        stage('Artifacts') {
          steps {
            archiveArtifacts 'target/*.hpi, target/*.jpi'
          }
        }
        stage('Junit Report') {
          steps {
            junit '**/surefire-reports/**/*.xml'
          }
        }
      }
    }
    stage('End') {
      steps {
        echo 'Successfully finished!'
      }
    }
  }
}