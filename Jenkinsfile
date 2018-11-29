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
    stage('Result Report UI') {
      steps {
        junit 'target/surefire-reports/testng-junit-results/junitreports/TEST-*.xml'
      }
    }
    stage('Convert results in HTML') {
      steps {
        bat 'ant -buildfile "build-junit_html_report.xml"'
      }
    }
  }
}