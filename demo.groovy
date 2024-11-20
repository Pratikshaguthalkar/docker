pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Simulating a build step
                    git branch: 'main', url: 'https://github.com/Pratikshaguthalkar/docker.git'
                    echo 'Building...'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    // Simulating a test step
                    echo 'Testing...112'
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
