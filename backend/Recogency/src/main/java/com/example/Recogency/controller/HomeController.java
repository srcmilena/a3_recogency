package com.example.Recogency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/mensagem")
    public ModelAndView mensagem() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", " Outra Mensagem vinda do servidor");
        return modelAndView;
    }

    @GetMapping("/saudacao")
    public ModelAndView saudacao() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("saudacao");
        return modelAndView;
    }


    @GetMapping("/saudacao{nome}")
    public ModelAndView saudacao(@RequestParam(required = false, defaultValue = "Recogency") String nome) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);
        return modelAndView;
    }

}
