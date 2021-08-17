pipeline{
    
    agent any
<<<<<<< HEAD
=======

>>>>>>> c74d225ee8980345033dde31293e51575a6657ec
    
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
