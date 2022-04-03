# README
This project is to be used as a sandbox to experiment with Spring Boot and Docker

## RUNNING LOCALLY
### Build the image:
docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/gs-spring-boot-docker .
### Run the application container:
docker run -p 8080:8080 springio/gs-spring-boot-docker
### Stop the application container:
docker ps
docker stop [value of the container name]
