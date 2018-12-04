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
            bat 'mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml'
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
    stage('.xml Result Report ') {
      steps {
        junit 'target/surefire-reports/testng-junit-results/junitreports/TEST-*.xml'
      }
    }
    stage('Convert .xml results in HTML') {
      steps {
        bat 'ant -buildfile "build-junit_html_report.xml"'
      }
    }
    stage('Send email with test results') {
      parallel {
        stage('Send email with test results - Selenium') {
          steps {
            emailext(subject: 'Pipeline Test Results -Selenium', body: '${FILE,path="target/surefire-reports/Selenium Suite/html/finalreport/TESTS-TestSuites.html"}', to: 'dragana.todorchevska@interworks.com.mk')
          }
        }
        stage('Send email with test results - JMeter') {
          steps {
            emailext(subject: 'Send email with test results - JMeter', body: '<h1>JMeter Test Results</h1><br> ${FILE,path="results/html/JMeterResults.html"}', to: 'dragana.todorchevska@interworks.com.mk')
          }
        }
      }
    }
  }
}