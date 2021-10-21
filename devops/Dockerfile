FROM gradle:jdk11 AS build

RUN mkdir -p /workspace
WORKDIR /workspace
COPY build.gradle /workspace
COPY settings.gradle /workspace
COPY src /workspace/src

RUN gradle clean build

ENTRYPOINT gradle clean test