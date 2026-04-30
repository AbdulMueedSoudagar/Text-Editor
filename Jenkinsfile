pipeline {
    agent none

    stages {

        stage('Build on Maven Agent') {
            agent { label 'maven' }

            steps {
                echo "Running on Maven Agent"
                sh 'hostname'
                sh 'mvn -v'
                sh 'mvn clean package'
            }
        }

        stage('Check Artifact (Maven Agent)') {
            agent { label 'maven' }

            steps {
                sh 'ls -l target'
            }
        }

        stage('Run Python Agent') {
            agent { label 'python' }

            steps {
                echo "Running on Python Agent"
                sh 'hostname'
                sh 'python3 --version'
                sh 'ls -l'
            }
        }

        stage('Try Access Artifact (Will Fail)') {
            agent { label 'python' }

            steps {
                sh 'ls -l target'
            }
        }
    }
}