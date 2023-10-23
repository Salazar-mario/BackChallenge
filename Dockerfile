FROM amazoncorretto:17-alpine-jdk

MAINTAINER MAS

COPY tarjet/techforb-0.0.1-SNAPSHOT techfor-app.jar

ENTRYPOINT ["java","-jar","/techfor-app.jar"]
