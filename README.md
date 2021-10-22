# devops-kafka

This branch contains a docker-compose file [kafkabroker.yml](kafkabroker.yml) which is used to start two docker containers: 

[Apache Zookeeper](https://zookeeper.apache.org/), the configuration service for [Apache Kafka](https://kafka.apache.org/documentation/#introduction) and the Kafka Broker itself. The broker advertises on port 29092 for your local development application to connect to via localhost:29092.

## Requirements

- Docker Engine ([install](https://docs.docker.com/engine/install/))
- Docker-Compose ([install](https://docs.docker.com/compose/install/))



## Run broker

Run docker-compose:

```bash
docker-compose -f kafkabroker.yml up -d
```

