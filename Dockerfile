FROM openjdk:11-slim
WORKDIR /opt/spring-cloud-playground
COPY target/core-eureka-server-0.0.1.jar .
ENTRYPOINT ["java","-jar","core-eureka-server-0.0.1.jar"]