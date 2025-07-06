def call(String image_name, String tag){
    echo "Building docker image"
    sh "docker build -t ${image_name}:${tag} ."
}