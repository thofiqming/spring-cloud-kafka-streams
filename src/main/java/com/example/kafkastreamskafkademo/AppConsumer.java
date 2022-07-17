package com.example.kafkastreamskafkademo;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class AppConsumer {

    @Bean
    public Consumer<KStream<Object, String>> process() {
        return input -> input.foreach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}
