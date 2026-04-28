pipeline {

 agent any

 stages {

   stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/AbdulMueedSoudagar/Text-Editor.git'
      }
   }

   stage('Compile') {
    steps {
        sh '''
        export JAVA_HOME=/opt/java/openjdk
        export PATH=$JAVA_HOME/bin:$PATH
        mvn compile
        '''
        }
    }

   stage('Test') {
      steps {
         sh 'mvn test'
      }
   }

   stage('Package') {
      steps {
         sh 'mvn package'
      }
   }

   stage('Deploy to Staging') {
      steps {
         sh '''
         mkdir -p /tmp/staging
         cp target/*.jar /tmp/staging/
         '''
      }
   }
 }

}