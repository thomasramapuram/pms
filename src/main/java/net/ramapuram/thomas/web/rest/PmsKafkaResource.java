package net.ramapuram.thomas.web.rest;

import net.ramapuram.thomas.service.PmsKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/pms-kafka")
public class PmsKafkaResource {

    private final Logger log = LoggerFactory.getLogger(PmsKafkaResource.class);

    private PmsKafkaProducer kafkaProducer;

    public PmsKafkaResource(PmsKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
