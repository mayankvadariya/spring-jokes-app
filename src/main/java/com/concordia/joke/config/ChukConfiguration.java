package com.concordia.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLOutput;

@Configuration
public class ChukConfiguration {
@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        System.out.println("In the @Bean");
        return new ChuckNorrisQuotes();
    }
}
