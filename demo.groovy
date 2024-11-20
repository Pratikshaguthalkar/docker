pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Simulating a build step
                    git branch: 'main', url: ''
                    echo 'Building...'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    // Simulating a test step
                    echo 'Testing...'
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Simulating a test step
                    echo 'Deploying...'
                }
            }
        }
    }

    post {
        success {
            echo 'Build Success!'
        }
        failure {
            echo 'Build Failed.'
        }
    }
}