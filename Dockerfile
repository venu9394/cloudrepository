FROM openjdk:11
ADD application.jar application.jar
EXPOSE 9095
ENTRYPOINT ["java","-jar","application.jar"]
