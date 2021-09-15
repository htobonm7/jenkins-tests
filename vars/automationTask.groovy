def call(Closure body) {
  stage('Step 1') {
    echo 'Running an automation task.'
    body()
  }
}

def someFunction(arg) {
  echo "Calling some function with $arg"
}
