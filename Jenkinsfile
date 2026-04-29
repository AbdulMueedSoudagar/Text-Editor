pipeline {

    agent any

    tools {
        maven 'maven3'
    }

    environment {
        IMAGE_NAME = "abdulm16/newJavaApp"
        TAG = "${BUILD_NUMBER}"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/AbdulMueedSoudagar/Text-Editor.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh """
                    docker build -t $IMAGE_NAME:$TAG .
                """
            }
        }

        stage('Container Validation Test') {
            steps {
                sh """
                    docker run --rm $IMAGE_NAME:$TAG
                """
            }
        }

        stage('Push To DockerHub') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-creds',
                    usernameVariable: 'USERNAME',
                    passwordVariable: 'PASSWORD'
                )]) {
                    sh """
                        echo $PASSWORD | docker login -u $USERNAME --password-stdin
                        docker push $IMAGE_NAME:$TAG
                        docker logout
                    """
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline Success'
        }
        failure {
            echo 'Pipeline Failed'
        }
    }
}