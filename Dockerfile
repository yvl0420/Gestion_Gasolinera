FROM openjdk:21-jdk-slim AS build
WORKDIR /app
COPY pom.xml .
RUN mvn clean install -DskipTests
COPY src /app/src
RUN mvn package -DskipTests
FROM openjdk:21-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]