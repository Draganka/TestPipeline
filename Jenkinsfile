pipeline {
  agent any
  stages {
    stage('Start') {
      steps {
        echo 'Start Execution.'
        bat 'mvn clean'
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
      }
    }
    stage('End') {
      parallel {
        stage('End') {
          steps {
            echo 'Successfully finished!'
          }
        }
        stage('html report') {
          steps {
            junit 'target/surefire-reports/junitreports/TEST-*.xml'
          }
        }
      }
    }
  }
}