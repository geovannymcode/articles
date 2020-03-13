FROM openjdk:11
ADD target/user-postgresql.jar user-postgresql.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "user-postgresql.jar"]