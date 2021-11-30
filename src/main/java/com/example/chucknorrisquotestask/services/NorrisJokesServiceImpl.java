package com.example.chucknorrisquotestask.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"JN","default"})
@Service
public class NorrisJokesServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public NorrisJokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
