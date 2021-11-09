package com.devOps.kafkaClientTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaClientTestApplicationTests {
    @Test
    public void addressTest(){
        System.out.println(System.getenv("BOOTSTRAP_ADDRESS"));
        assert System.getenv("BOOTSTRAP_ADDRESS").equals("kafkabroker:9092");
    }
}
