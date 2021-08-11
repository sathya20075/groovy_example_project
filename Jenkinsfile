def groovy
pipeline{
    
    agent {
        label any
    }

    
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
	    groovy.compileApp()
	    }
	}
    }
}
