pipeline{
    
    agent any

    
    stages{
        stage('Invoke a groovy script'){
            steps{
                script {
                  groovy = load 'script.groovy'
                }
            }
        }
	stage('Compile a java app'){
	  steps{
	     script{
	       groovy.compileApp()
	      }
	    }
	}
    }
}
