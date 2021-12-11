FROM testing_devops AS build

FROM openjdk:11-jdk-slim

COPY --from=build /workspace/target/*.jar app.jar

EXPOSE 80
ENTRYPOINT ["java","-jar","app.jar", "--server.port=80"]