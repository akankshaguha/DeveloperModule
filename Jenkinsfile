#!groovy

node{
 git 'https://github.com/exorcist007/DeveloperModule.git'
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
stage 'START_BUILDING_MODERATOR_MODULE'
stage 'CLONE_MODERATOR_MODULE'
node {
 git 'https://github.com/exorcist007/ModeratorModule.git'
}
stage 'copy_artifact'
//node{
//step([$class: 'CopyArtifact', fingerprintArtifacts: true, projectName: 'DeveloperModule/', selector: [$class: 'StatusBuildSelector', stable: false], target: '../ModeratorModule/repo'])
//step([$class: 'CopyArtifact', fingerprintArtifacts: true, projectName: 'DeveloperModule/', selector: [$class: 'SpecificBuildSelector', buildNumber: '1'], target: 'ModeratorModule/repo/'])
//step([$class: 'CopyArtifact', fingerprintArtifacts: true, projectName: 'DeveloperModule/', selector: [$class: 'TriggeredBuildSelector', allowUpstreamDependencies: true, fallbackToLastSuccessful: true, upstreamFilterStrategy: 'UseGlobalSetting'], target: 'ModeratorModule/repo/'])
//}
stage 'CLEAN_MODERATOR_MODULE'
node {
  sh 'chmod +x gradlew'
  sh './gradlew clean --info'
}
stage 'BUILD_MODERATOR_MODULE'
node {
  sh 'chmod +x gradlew'
  sh './gradlew build --info'
}
stage 'TEST_MODERATOR_MODULE'
node {
  	 sh 'chmod +x gradlew'
  	 sh './gradlew test --info'
}
