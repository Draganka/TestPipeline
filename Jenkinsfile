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
        stage('test report') {
          steps {
            sh '''def reportPath = build.getWorkspace().child("target/surefire-reports/emailable-report.html")
msg.setContent(reportPath.readToString(),"text/html");'''
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