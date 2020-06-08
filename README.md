# k8s-with-java


# simple clean build
mvn clean install

# docker build
docker image build -t venkat/k8swithjava .

# docker run
docker container run -p 8080:8080 venkat/k8swithjava