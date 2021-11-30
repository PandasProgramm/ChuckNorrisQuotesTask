package com.example.chucknorrisquotestask.controllers;

import com.example.chucknorrisquotestask.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NorrisJokeController {

    private final JokeService jokeService;

    public NorrisJokeController(@Qualifier("norrisJokesServiceImpl") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showNorrisJoke(Model model) {
        model.addAttribute("joke", this.jokeService.getJoke());
        return "index";
    }
}

