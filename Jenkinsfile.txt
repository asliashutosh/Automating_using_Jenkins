pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Hello World'
            }
        }

    }


 post{
            always{
                emailext body: 'Test Data value', compressLog: true, subject: 'Summary of CICD Pipeline run', to: 'shivani.rathi16@gmail.com'
            }
 }
}
