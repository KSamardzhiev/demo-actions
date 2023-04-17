package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TalentBoostController {

    private static final String template = "Welcome to TalenBoost 2023, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/talentboost")
    public TalentBoostGreeting talentboost(@RequestParam(value = "name", defaultValue = ":)") String name) {
        return new TalentBoostGreeting(counter.incrementAndGet(), String.format(template, name));
    }
}