pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Dragana'
      }
    }
    stage('Test') {
      steps {
        bat 'mvn test'
        echo 'Done!'
      }
    }
    stage('JMeter test') {
      steps {
        bat 'cd C:\\Users\\dragana.todorchevska\\.jenkins\\workspace\\TestPipeline_master-4JM27EXS2RGGKJ6BGNZQZX3EOXE2VOHVSFCSQFCNP2U7GIQZ6IFQ\\JMeter'
        bat 'ant -buildfile "build.xml"'
      }
    }
  }
}