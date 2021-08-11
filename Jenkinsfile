pipeline{
    
    agent {
        label any
    }
    
    stages{
        stage('Invoke a groovy script'){
            steps{
                script {
                    groovy=load "script.groovy"
                }
            }
        }
    }
}
