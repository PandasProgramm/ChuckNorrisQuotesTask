package com.example.chucknorrisquotestask.controllers;

import com.example.chucknorrisquotestask.services.NorrisJokesServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NorrisJokeControllerTest {

    NorrisJokeController norrisJokeController;
    @BeforeEach
    void setUp() {
        this.norrisJokeController = new NorrisJokeController(new NorrisJokesServiceImpl());
    }

    @Test
    void showNorrisJoke() {
        System.out.println(this.norrisJokeController.showNorrisJoke(new ModelTest()));
    }
}
class ModelTest implements Model{
    @Override
    public Model addAttribute(String attributeName, Object attributeValue) {
        return null;
    }

    @Override
    public Model addAttribute(Object attributeValue) {
        return null;
    }

    @Override
    public Model addAllAttributes(Collection<?> attributeValues) {
        return null;
    }

    @Override
    public Model addAllAttributes(Map<String, ?> attributes) {
        return null;
    }

    @Override
    public Model mergeAttributes(Map<String, ?> attributes) {
        return null;
    }

    @Override
    public boolean containsAttribute(String attributeName) {
        return false;
    }

    @Override
    public Object getAttribute(String attributeName) {
        return null;
    }

    @Override
    public Map<String, Object> asMap() {
        return null;
    }
}
