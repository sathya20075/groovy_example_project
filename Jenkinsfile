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
        stage('Test a java app'){
	  steps{
	     script{
	       groovy.testApp()
	      }
	    }
	}
	stage('Build a java app'){
	  steps{
	     script{
	       groovy.buildApp()
	      }
	    }
	}
	stage('Deploy a java app'){
	  steps{
	     script{
	       groovy.deployApp()
	      }
	    }
	}
	    
	    
    }
}
