FROM openjdk:21-jdk

WORKDIR /app

COPY ./target/inventory-0.0.1-SNAPSHOT.jar /app/inventory-0.0.1-SNAPSHOT.jar

EXPOSE 8084

CMD ["java", "-jar", "inventory-0.0.1-SNAPSHOT"]