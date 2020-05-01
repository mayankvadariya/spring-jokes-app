package com.concordia.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JokeServiceImpl implements  JokeService{
    //Here creating a final variable gives an advantage of only creating an object once
private final ChuckNorrisQuotes chuckNorrisQuotes;

//Constructor based injected but we have to provide the ChuckNorrisQuotes in the context and hence we are using the java based
    //Configuration  and Bean to get it.
    public JokeServiceImpl(ChuckNorrisQuotes abc) {
        System.out.println("In the JokeServiceImpl constructor");
        this.chuckNorrisQuotes = abc;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
