From openjdk:22-jdk
ADD target/sm-app-poc.jar sm-app-poc.jar
ENTRYPOINT ["java", "-jar", "/sm-app-poc.jar"]
