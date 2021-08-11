import jenkins.model.*
jenkins = Jenkins.instance


def compileApp(){
   echo "Building the application"
}

def testApp(){
   echo "Testing the application"
}

def buildApp(){
   echo "Building the application"
}

def deployApp(){
   echo "Deploying the application"
}

return this

