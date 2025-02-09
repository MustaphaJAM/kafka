![Kafka Logo](https://upload.wikimedia.org/wikipedia/commons/0/05/Apache_kafka_wordtype.svg)
# Kafka Project

Kafka is a tool that helps handle large amounts of data by efficiently sending and receiving messages. It uses a distribution strategy to manage data flow.

## How Kafka Works

- **Producer**: Sends data/messages to Kafka.
- **Consumer**: Receives data/messages from Kafka.
- **Partition**: Divides data to handle the load efficiently.
- **Broker**: Holds the partitions.
- **Record**: The actual data stored in partitions.
- **Topic**: A collection of partitions with the same type of data.
- **Real-time Updates**: Kafka listens to updates in real-time, making it great for streaming data apps.
- **Zookeeper**: Manages Kafka clusters.

## Kafka Setup with Spring Boot

I used **Spring Boot** to make working with Kafka much easier. It helped set up producers, consumers, and topics with simple annotations like `@KafkaListener` and `@Configuration`. All Kafka settings are managed in `application.properties`.

### Setting Up Kafka Environment

1. **Run Zookeeper**: Manages the Kafka cluster.
2. **Run Kafka Broker**: Handles partitions and data.
3. **Create a Topic**: A category for storing data.
4. **Create a Producer**: Sends data to the topic.
5. **Create a Consumer**: Receives data from the topic.
6. **Create a Listener**: Listens to updates in real-time.

## Project Diagram

The Kafka architecture and workflow are visually represented in the project.

![Project Diagram](chart.svg)

---

### Running the Project

1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/kafka-project.git
   cd kafka-project
   ```
2. Start Kafka and Zookeeper.
3. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```
4. Open `chart.html` in your browser to visualize the Kafka flow.

🚀 Happy Coding!
