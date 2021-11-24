# springboot-docker-containerize-example
![Java Badge](https://img.shields.io/badge/java-11-red?logo=java)
[![Sonarqube Badge](https://img.shields.io/badge/Sonarqube-gray?logo=Sonarqube)](http://34.125.83.167:9000/dashboard?id=com.app.example%3Ajava-app)
[![Swagger Badge](https://img.shields.io/badge/Swagger-API%20Spec-6DB33F?logo=Swagger)]
![Spring boot MVC Badge](https://img.shields.io/badge/Spring%20Boot-MVC-6DB33F?logo=spring)
[Jenkins Build Status](http://34.125.83.167:8080/buildStatus/icon?job=java-maven-docker&build=23 "http://34.125.83.167:8080/job/java-maven-docker/23/")




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
