#!groovy


stage 'CHECKOUT_DEVELOPER_SCM'
node {
    // first repository
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'DeveloperModule']], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/exorcist007/DeveloperModule.git']]])
   //
   
    // run second script
}

stage 'load_DEVELOPER_MODULE'
node{
       load 'DeveloperModule/Jenkinsfile'
}
stage 'CLEAN_DEVELOPER_MODULE'
node {
   	sh 'chmod +x gradlew'
  sh './gradlew clean --info'
   }
   
stage 'BUILD_DEVELOPER_MODULE'
node {
 sh 'chmod +x gradlew'
  sh './gradlew build --info'
   	
   }
   
stage 'TEST_DEVELOPER_MODULE'
node {
   	sh 'chmod +x gradlew'
  sh './gradlew test --info'
   	}
   	
stage 'ATRIFACT_DEVELOPER_MODULE'
node {
   sh 'chmod +x gradlew'
  sh './gradlew jar --info'
   	}
   
stage 'ARCHIVE_ARTIFACTS'
node{
  step([$class: 'ArtifactArchiver', artifacts: '**/build/libs/*.jar', fingerprint: true])
}
stage 'CHECKOUT_MODERATOR_SCM'
node{
  // second repository
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'ModeratorModule']], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/exorcist007/ModeratorModule.git']]])
    // run first script
    load 'ModeratorModule/Jenkinsfile'
}



