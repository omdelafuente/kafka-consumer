package com.oscarmartin.kafkaconsumer.config;

import com.oscarmartin.kafkaconsumer.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}

