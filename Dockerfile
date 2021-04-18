FROM adoptopenjdk:11-jre-hotspot
COPY build/libs/snacks-microservice-0.0.1-SNAPSHOT.jar snacks-microservice.jar
CMD ["java", "-jar", "snacks-microservice.jar"]