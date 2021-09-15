node {
  stage('Build') {
    echo 'Building ...'
    checkout scm
    sh 'pwd; ls'
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
