FROM maven:latest

LABEL author="Nikomeril"

WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

CMD ["java", "-jar", "target/Laskin.jar"]