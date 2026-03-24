package kr.ac.kopo.yoon.bookmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcomeController {
    @GetMapping("/home")
    public String welcomeMethod () {
        return "welcome";
    }
}