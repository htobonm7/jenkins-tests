node {
  stage('Build') {
    echo 'Building ...'
    checkout scm
    sh 'ls'
  }
  stage('Test') {
    echo 'Testing ...'

    def myCustomString = 'holaHamiltooooooooooooon!'
    withEnv([
      "MY_CUSTOM_ENV_VARIABLE=${myCustomString}",
      'MY_OTHER_CUSTOM_ENV=aquiEStoy!!'
    ]) {
      sh 'env | grep MY'
    }
  }
  stage('Deply') {
    echo 'Deploying ...'
    if (currentBuild.result == null || currentBuild.result == 'SUCCESS') {
      echo 'SUCEEEEEEEEEEEEEEEES!!!'
    }
  }
}
