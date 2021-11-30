package com.example.chucknorrisquotestask.controllers;

import com.example.chucknorrisquotestask.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class NorrisJokeController {

    private final JokeService jokeService;

    public NorrisJokeController(@Qualifier("norrisJokesServiceImpl") JokeService jokeService) {
        this.jokeService = jokeService;
    }
    public String getJoke(){
        return this.jokeService.getJoke();
    }
}

