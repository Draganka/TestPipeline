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
    stage('Send email with test results') {
      steps {
        emailext(subject: 'Pipeline Test Results', body: '${FILE,path="target/surefire-reports/testng-junit-results/junitreports/html/finalreport/TESTS-TestSuites.html"} <br><h1>JMeter Test Results</h1><br> ${FILE,path="results/html/JMeterTest.html"}', to: 'dragana.todorchevska@interworks.com.mk')
      }
    }
  }
}