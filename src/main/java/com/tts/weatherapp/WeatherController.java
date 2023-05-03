package com.tts.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;



@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping
public String getIndex(Model model) {
    Response response = weatherService.getForecast("43210");
    model.addAttribute ("data", response);
    return "index";
}
}


