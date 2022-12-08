FROM maven:3.8.2-jdk-8
COPY  target/ExamThourayaS2-0.0.1-SNAPSHOT.jar examThourayaS2-0.0.1.jar
EXPOSE 8089

ENTRYPOINT ["java", "-jar", "examThourayaS2-0.0.1.jar "]