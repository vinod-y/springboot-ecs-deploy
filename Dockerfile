FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/springboot-ecs-deploy-service.jar springboot-ecs-deploy-service.jar
ENTRYPOINT ["java","-jar","/springboot-ecs-deploy-service.jar"]