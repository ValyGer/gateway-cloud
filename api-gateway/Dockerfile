FROM amazoncorretto:21-alpine-jdk
COPY target/*.jar api-gateway-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/api-gateway-1.0-SNAPSHOT.jar"]