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
      'MY_OTHER_CUSTOM_ENV=aquiEStoy!!',
      """MY_CC=${sh(returnStdout: true, script: 'echo "clang"')}""",
      """MY_STAT=${sh(returnStatus: true, script: 'exit 1')}"""
    ]) {
      sh 'env | grep MY'
      sh 'printenv'
    }

    sh 'env | grep MY'
  }
  stage('Deply') {
    echo 'Deploying ...'
    if (currentBuild.result == null || currentBuild.result == 'SUCCESS') {
      echo 'SUCEEEEEEEEEEEEEEEES!!!'
    }
  }
}
