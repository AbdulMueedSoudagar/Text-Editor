FROM eclipse-temurin:17

WORKDIR /app

COPY target/javaapp-1.0.jar app.jar

CMD ["java","-jar","app.jar"]