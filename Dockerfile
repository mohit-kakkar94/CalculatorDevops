FROM openjdk:8
EXPOSE 8081
ADD target/devops_calculator-1.0-SNAPSHOT-jar-with-dependencies.jar devops_calculator-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-cp","devops_calculator-1.0-SNAPSHOT-jar-with-dependencies.jar","calculator.App"]
