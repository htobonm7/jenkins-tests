def call() {
  node('master') {
    stage('Step 1') {
      sh 'Running an automation task.'
    }
  }
}
