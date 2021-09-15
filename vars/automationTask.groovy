def call(Closure body) {
  properties([
    parameters([string(defaultValue: 'Hello', description: 'How should I greet the world?', name: 'Greeting')])
  ])
  stage('Step 1') {
    echo 'Running an automation task.'
    body()
  }
}

def someFunction(arg) {
  echo "Calling some function with $arg"
}
