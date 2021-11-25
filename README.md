# springboot-docker-containerize-example
![Java Badge](https://img.shields.io/badge/java-11-red?logo=java)
[![Sonarqube Badge](https://img.shields.io/badge/Sonarqube-gray?logo=Sonarqube)](http://34.125.83.167:9000/dashboard?id=com.example%3Ademo)
[![Swagger Badge](https://img.shields.io/badge/Swagger-API%20Spec-6DB33F?logo=Swagger)]
![Spring boot MVC Badge](https://img.shields.io/badge/Spring%20Boot-MVC-6DB33F?logo=spring)
![Jenkins Build Status](http://34.125.83.167:8080/job/springboot-maven-docker&build=4)

## This springboot application is automated with CI and CD pipelines and deployed on to GCP VM instance.
Sonarqube Report -  http://34.125.83.167:9000/dashboard?id=com.example%3Ademo
Jenkins Pipeline - http://34.125.83.167:8080/job/springboot-maven-docker/
Push to Docker Hub - https://hub.docker.com/repository/docker/madhuperam29/springboot-docker-containerize-example

##Here are the links to the API endpoints for testing - 
API base endpoint on cloud - http://34.125.83.167:8081/users
HTTP GET api/v1/users/all
HTTP GET api/v1/users/{userId}
HTTP POST api/v1/users ( user payload to be sent)
HTTP PUT api/v1/users/{userId}
HTTP DELETE api/v1/users/{userId}

##Swagger link
http://34.125.83.167:8081/swagger-ui.html


## How to run in local

## Building

```console
# UNIX
you@your-pc:springboot-docker-containerize-example/$ ./mvnw clean package
```
```dos
# Windows
C:\Users\Me\springboot-docker-containerize-example> .\mvnw.cmd clean package
```

## Running

```console
# UNIX
you@your-pc:springboot-docker-containerize-example/$ ./mvnw spring-boot:run
```
```dos
# Windows
C:\Users\Me\springboot-docker-containerize-example> .\mvnw.cmd spring-boot:run 
