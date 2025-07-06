def call(String image_name){
    echo "Building docker image"
    sh "docker build -t ${image_name} ."
}