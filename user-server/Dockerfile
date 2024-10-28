FROM amazoncorretto:21-alpine-jdk
COPY target/*.jar user-server-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/user-server-1.0-SNAPSHOT.jar"]