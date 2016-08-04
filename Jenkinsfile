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
  //step([$class: 'ArtifactArchiver', artifacts: '**/build/libs/*.jar', fingerprint: true])
}




