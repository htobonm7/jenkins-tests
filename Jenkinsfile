node {
  stage('Build') {
    echo 'Building ...'
    checkout scm
    sh 'ls non_existent_path'
  }
  stage('Test') {
    echo 'Testing ...'
  }
  stage('Deply') {
    echo 'Deploying ...'
    if (currentBuild.result == null || currentBuild.result == 'SUCCESS') {
      echo 'SUCEEEEEEEEEEEEEEEES!!!'
    }
  }
}
