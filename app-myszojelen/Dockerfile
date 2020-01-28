#
# Build stage
#
FROM maven:alpine AS build
ARG SRC_FOLDER=/tmp/src
COPY pom.xml ${SRC_FOLDER}/
COPY core/pom.xml ${SRC_FOLDER}/core/
COPY core/src ${SRC_FOLDER}/core/src/
COPY backend/pom.xml ${SRC_FOLDER}/backend/
COPY backend/src ${SRC_FOLDER}/backend/src/
COPY frontend/pom.xml ${SRC_FOLDER}/frontend/
COPY frontend/src ${SRC_FOLDER}/frontend/src/
RUN mvn -f ${SRC_FOLDER}/pom.xml clean package

#
# Package stage
#
FROM openjdk:8-jdk-alpine
ARG BUILD_FOLDER=/usr/local/lib
ARG SRC_FOLDER=/tmp/src
COPY --from=build ${SRC_FOLDER}/core/target/*.jar ${BUILD_FOLDER}/app.jar
WORKDIR ${BUILD_FOLDER}
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=dev", "/app.jar"]
#,"-Djava.security.egd=file:/dev/./urandom"