package com.devOps.kafkaClientTest;

import lombok.Getter;
import lombok.Setter;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @Setter
    @Getter
    private CountDownLatch latch = new CountDownLatch(1);
    @Setter
    @Getter
    private String payload = null;

    @KafkaListener(topics = "mytopic")
    public void receive(ConsumerRecord<?, ?> consumerRecord) {
        LOGGER.info("received payload='{}'", consumerRecord.toString());
        setPayload(consumerRecord.toString());
        latch.countDown();
    }

}