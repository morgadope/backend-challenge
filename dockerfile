FROM openjdk:11
ADD target/backend-challenge-1.0.0-RELEASE.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]