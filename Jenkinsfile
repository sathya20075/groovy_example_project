pipeline{
    
    agent {
        label any
    }

    environment{
      def groovy;
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
