FROM maven:3.8.2-jdk-8
COPY  target/ExamThourayaS2-0.0.1-SNAPSHOT.jar ExamThourayaS2-0.0.1-SNAPSHOT.jar
EXPOSE 8089

ENTRYPOINT ["java", "-jar", "ExamThourayaS2-0.0.1-SNAPSHOT.jar "]