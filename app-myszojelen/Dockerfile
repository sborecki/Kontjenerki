#
# Build stage
#
FROM maven:alpine AS build
ARG SRC_FOLDER=/tmp/src
COPY pom.xml ${SRC_FOLDER}/pom.xml
COPY core/pom.xml ${SRC_FOLDER}/core/pom.xml
COPY backend/pom.xml ${SRC_FOLDER}/backend/pom.xml
COPY frontend/pom.xml ${SRC_FOLDER}/frontend/pom.xml
#TODO: add webapp deployment descriptor when switching from jar to war
RUN mvn --file ${SRC_FOLDER} dependency:go-offline package --batch-mode --fail-never
COPY core/src ${SRC_FOLDER}/core/src/
COPY backend/src ${SRC_FOLDER}/backend/src/
COPY frontend/src ${SRC_FOLDER}/frontend/src/
RUN mvn --file ${SRC_FOLDER}/pom.xml package

#
# Package stage
#
FROM openjdk:8-jdk-alpine
ARG BUILD_FOLDER=/tmp/lib
ARG SRC_FOLDER=/tmp/src
WORKDIR ${BUILD_FOLDER}
COPY --from=build ${SRC_FOLDER}/core/target/*.jar app.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=dev", "app.jar"]
#,"-Djava.security.egd=file:/dev/./urandom"