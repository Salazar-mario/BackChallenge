FROM amazoncorretto:17-alpine-jdk
MAINTAINER techfor
COPY tarjet/techforb-0.0.1-SNAPSHOT.jar techfor-app.jar
ENTRYPOINT ["java","-jar","/techfor-app.jar"]
EXPOSE 8080
