FROM maven:3-eclipse-temurin-25

COPY . /app

WORKDIR /app

RUN mvn clean package -DskipTests

FROM eclipse-temurin:25-jdk

COPY --from=0 /app/target/*jar-with-dependencies.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]