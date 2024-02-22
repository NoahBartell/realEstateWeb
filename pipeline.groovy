pipeline{
    agent any
    stages{
        stage('Cloning Git'){
            steps{
                echo 'Cloneing Git Phase'
            }
        }
        stage('Build-and-Tag'){
            steps{
                echo 'Build-and-Tag'
            }
        }
        stage('Post-to-DockerHub'){
            steps{
                echo 'Post-to-DockerHub Phase'
            }
        }
        stage('Pull-image-server'){
            steps{
                echo 'Pull-image-server Phase'
            }
        }
    }
}