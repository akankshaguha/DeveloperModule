#!groovy
node('CLONE_DEVELOPER_PROJECT') {
 git 'https://github.com/exorcist007/DeveloperModule.git'
}

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

node('CLONE_MODERATOR_PROJECT') {
 git 'https://github.com/exorcist007/ModeratorModule.git'
}

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

node('BUILD_MODERATOR_PROJECT') {
   if(isUnix()){
   	 sh 'chmod +x gradlew'
 	 sh './gradlew build --info'
   }else {
   	bat 'gradlew build --info'
   }
}
