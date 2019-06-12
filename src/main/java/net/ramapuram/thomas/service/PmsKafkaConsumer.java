package net.ramapuram.thomas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PmsKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(PmsKafkaConsumer.class);
    private static final String TOPIC = "topic_pms";

    @KafkaListener(topics = "topic_pms", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
