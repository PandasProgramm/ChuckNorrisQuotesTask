package com.example.chucknorrisquotestask;

import com.example.chucknorrisquotestask.controllers.NorrisJokeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChuckNorrisQuotesTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckNorrisQuotesTaskApplication.class, args);
     /* ApplicationContext ctx = SpringApplication.run(ChuckNorrisQuotesTaskApplication.class, args);
        NorrisJokeController norrisJokeController = (NorrisJokeController) ctx.getBean("norrisJokeController");
        System.out.println(norrisJokeController.getNorrisJokeWithoutTemplate());*/
    }

}
