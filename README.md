# Getting Started Kafka

cd C:\Installers\kafka

Zookeeper and Kafka:

▶️ Start Zookeeper
C:\Installers\kafka\bin\windows\zookeeper-server-start.bat C:\Installers\kafka_2.13-3.6.1\config\zookeeper.properties
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

▶️ Start Kafka
.\bin\windows\kafka-server-start.bat .\config\server.properties

▶️ Create a new topic in kafka server
.\bin\windows\kafka-topics.bat --create --topic sports --bootstrap-server localhost:9092

▶️ Describe topic
.\bin\windows\kafka-topics.bat --describe --topic sports --bootstrap-server localhost:9092

▶️ List all topics in a broker
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

▶️ Watch topic messages
.\bin\windows\kafka-console-consumer.bat --topic sports --bootstrap-server localhost:9092

▶️ Send menssajes to a topic
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic sports

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)

