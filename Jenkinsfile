pipeline {

 agent any

 tools {
   jdk 'jdk17'
   maven 'maven3'
 }

 stages {

   stage('Checkout') {
      steps {
         git 'https://github.com/AbdulMueedSoudagar/Text-Editor.git'
      }
   }

   stage('Compile') {
      steps {
         sh 'mvn compile'
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