def call(String url, String branch){
    echo "trying to clone notes-app"
    git url: "${url}", branch: "${branch}"
}