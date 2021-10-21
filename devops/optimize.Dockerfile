FROM testing_devops AS build

FROM openjdk:11-jdk-slim

COPY --from=build /workspace/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]