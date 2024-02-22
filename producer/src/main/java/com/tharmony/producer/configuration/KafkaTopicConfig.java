package com.tharmony.producer.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.Hashtable;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic generateTopic() {
        Map<String, String> configurations = new Hashtable<>();
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000"); //time retention messages
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824"); //max segment size in bytes
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012"); //max size of each message default 1mb


        return TopicBuilder.name("news")
                .partitions(2)
                .replicas(2)
                .configs(configurations)
                .build();
    }
}
