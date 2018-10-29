pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''pipeline { 
    agent any  
    stages { 
        stage(\'Build\') { 
            steps { 
               echo \'This is a minimal pipeline.\' 
            }
        }
    }
}'''
      }
    }
  }
}