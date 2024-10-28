FROM amazoncorretto:21-alpine-jdk
COPY target/*.jar eureka-server-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/eureka-server-1.0-SNAPSHOT.jar"]