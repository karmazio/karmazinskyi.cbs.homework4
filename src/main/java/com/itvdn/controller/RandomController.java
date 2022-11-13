package com.itvdn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.UUID;

@Controller
public class RandomController {

    @GetMapping(value = "/uuid")
    public @ResponseBody String getRandomUUID() {
        return String.valueOf(UUID.randomUUID());
    }

    @GetMapping(value = "/rollD4")
    public @ResponseBody String rollD4() {
        return "D4 roll: " + (int) (Math.random() * 4 + 1);
    }

    @GetMapping(value = "/rollD6")
    public @ResponseBody String rollD6() {
        return "D6 roll: " + (int) (Math.random() * 6 + 1);
    }

    @GetMapping(value = "/rollD8")
    public @ResponseBody String rollD8() {
        return "D8 roll: " + (int) (Math.random() * 8 + 1);
    }

    @GetMapping(value = "/rollD10")
    public @ResponseBody String rollD10() {
        return "D10 roll: " + (int) (Math.random() * 10 + 1);
    }

    @GetMapping(value = "/rollD12")
    public @ResponseBody String rollD12() {
        return "D12 roll: " + (int) (Math.random() * 12 + 1);
    }

    @GetMapping(value = "/rollD20")
    public @ResponseBody String rollD20() {
        return "D20 roll: " + (int) (Math.random() * 20 + 1);
    }

}
