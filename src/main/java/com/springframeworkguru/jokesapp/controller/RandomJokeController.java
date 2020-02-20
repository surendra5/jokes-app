package com.springframeworkguru.jokesapp.controller;

import com.springframeworkguru.jokesapp.service.RandomJokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomJokeController {

    @Autowired
    private RandomJokeServiceImpl randomJokeServiceImpl;

    @RequestMapping({"/ ", ""})
    public String randomJokeView(Model model){
        model.addAttribute("joke", randomJokeServiceImpl.getRandomJoke());

        return "index";
    }
}
