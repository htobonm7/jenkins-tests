
node {
  checkout scm
  automationTask(
    [string(defaultValue: 'Haha', description: 'How should I greet the world?', name: 'Hahaha')]
  ) {
    echo 'Inside automation task!'
  }
  automationTask.someFunction 'hola'
}
