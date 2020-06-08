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
