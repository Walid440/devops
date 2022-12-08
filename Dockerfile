FROM maven:3.8.2-jdk-8

ADD target/DevOps.jar DevOps.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/DevOps.jar"]