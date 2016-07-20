#!groovy

node{
 git 'https://github.com/exorcist007/DeveloperModule.git'
}
stage 'CLEAN_DEVELOPER_MODULE'
node {
   	bat 'gradle clean --info'
   }
stage 'BUILD_DEVELOPER_MODULE'
node {
   	bat 'gradle build --info'
   }
stage 'TEST_DEVELOPER_MODULE'
node {
   	bat 'gradle test --info'
   	}
stage 'ATRIFACT_DEVELOPER_MODULE'
node {
   	bat 'gradle jar --info'
   	}
   	node{
 if(fileExists 'DeveloperProject.jar'){
  echo 'good'
 }else echo 'bad'
//step([$class: 'CopyArtifact', filter: '**/DeveloperProject.jar', fingerprintArtifacts: true, projectName: 'DeveloperModule/', selector: [$class: 'StatusBuildSelector', stable: false]])
 
}
 stage 'ARCHIVE_ARTIFACTS'
node{
  step([$class: 'ArtifactArchiver', artifacts: '**/build/libs/*.jar', fingerprint: true])
}
stage 'START_BUILDING_MODERATOR_MODULE'
node{
//build 'ModeratorModule'
}
