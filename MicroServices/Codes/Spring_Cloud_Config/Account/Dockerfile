#Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

#Information around who maintains the image
MAINTAINER Shubham_Ashtaputre

# Add the application's jar to the container
COPY target/Account-1.0.jar Account-1.0.jar

#execute the application
ENTRYPOINT ["java","-jar","/Account-1.0.jar"]