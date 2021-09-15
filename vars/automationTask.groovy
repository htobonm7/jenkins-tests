def call(Closure body) {
  stage('Step 1') {
    sh 'Running an automation task.'
    body()
  }
}

def someFunction(arg) {
  echo "Calling some function with $arg"
}
