#!groovy

stage 'CLONE_CLEAN_DEVELOPER_MODULE'
node('CLEAN_DEVELOPER_PROJECT') {
   if(isUnix()){
   	 sh 'chmod +x gradlew'
 	 sh './gradlew clean --info'
   }
   else 
   {
   	bat 'gradlew clean --info'
   }
}
stage 'BUILD_DEVELOPER_MODULE'
node('BUILD_DEVELOPER_PROJECT') {
   if(isUnix())
   {
   	 sh 'chmod +x gradlew'
 	 sh './gradlew build --info'
   }
   else 
   {
   	bat 'gradlew build --info'
   }
}
stage 'CREATE_ARTIFACT_DEVELOPER_MODULE'
node('CREATE_ARTIFACT_DEVELOPER_PROJECT') {
   if(isUnix())
   {
   	 sh 'chmod +x gradlew'
 	 sh './gradlew jar --info'
   }
   else {
   	bat 'gradlew jar --info'
   }
}
stage 'CLONE_MODERATOR_MODULE'
node('CLONE_MODERATOR_PROJECT') {
 git 'https://github.com/exorcist007/ModeratorModule.git'
}
stage 'CLEAN_MODERATOR_MODULE'
node('CLEAN_MODERATOR_PROJECT') {
   if(isUnix())
   {
   	 sh 'chmod +x gradlew'
 	 sh './gradlew clean --info'
   }
   else {
   	bat 'gradlew clean --info'
   }
}
stage 'BUILD_MODERATOR_MODULE'
node('BUILD_MODERATOR_PROJECT') {
   if(isUnix()){
   	 sh 'chmod +x gradlew'
 	 sh './gradlew build --info'
   }else {
   	bat 'gradlew build --info'
   }
}
