FROM openjdk:17
EXPOSE 8080
ADD build/libs/demo-0.0.1-SNAPSHOT.jar account-balance-service.jar
ENTRYPOINT ["java", "-jar", "/account-balance-service.jar"]