def call() {
  stage('Step 1') {
    sh 'Running an automation task.'
  }
}

def someFunction(arg) {
  sh "Calling some function with $arg"
}
