FROM maven:3.6.3-jdk-11-slim AS build

RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src

RUN mvn -B -f pom.xml clean package -DskipTests

ENTRYPOINT mvn -B -f pom.xml clean package && mvn -B clean verify -DskipTests