def call(String user,String project, String image_tag){
    echo "Pushing image to docker hub repository"
    withCredentials([usernamePassword('credentialsId': "DockerHubCred",
    usernameVariable: "DockerHubUser",
    passwordVariable: "DockerHubPass")]){
    sh "docker login -u ${user} -p ${env.DockerHubPass}"
    sh "docker push ${user}/${project}:${image_tag}"
    }
}