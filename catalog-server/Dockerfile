FROM amazoncorretto:21-alpine-jdk
COPY target/*.jar catalog-server-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/catalog-server-1.0-SNAPSHOT.jar"]