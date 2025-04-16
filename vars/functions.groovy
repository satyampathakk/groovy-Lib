def call(String url, String branch) {
    echo " Cloning the code from ${url} [${branch}]"
    git url: url, branch: branch
    echo " Clone complete"
}

def printMessage(String msg) {
    echo "Message: ${msg}"
}


def deployApp(String environment) {
    echo " Deploying to ${environment}"
    sh "./deploy.sh ${environment}"
    echo " Deployment to ${environment} done"
}

