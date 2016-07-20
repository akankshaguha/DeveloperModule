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
   	bat 'gradle test --info'
   	}
