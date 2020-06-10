# k8s-with-java


## simple clean build
mvn clean install

## docker build
docker image build -t venkat/k8swithjava .

## docker run
docker container run -p 8080:8080 venkat/k8swithjava


## Building docker images using Jib
Add the Jib plugin in profiles section in POM.xml and run the below
mvn package -Pjib

## Instead of building docker daemon, we can directly build the image to docker registry
mvn jib:build -Pjib


## Build docker image with minimal

##install virtual box & minikube

`brew cask install virtualbox`

`brew cask install minikube`

## After having the deployment & service configurations
kubectl create -f deployment.yaml

kubectl create -f service.yaml

## If you want to use single configuration file for both deployment & service, see k8swithjava.yaml
kubectl create -f k8swithjava.yaml

## See the Kubernetes Objects for inspection

kubectl get svc
kubectl get deployment
kubectl get pods

or

kubectl get svc,deployment,pods

