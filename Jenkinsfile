import script.groovy
pipeline{
    
    agent {
        label any
    }

    
    stages{
        stage('Invoke a groovy script'){
            steps{
                script {
                  def groovy=load "script.groovy"
                }
            }
        }
    }
}
