package com.springframeworkguru.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomJokeServiceImpl implements RandomJokeService {


    private ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomJokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
