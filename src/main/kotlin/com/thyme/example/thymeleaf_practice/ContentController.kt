package com.thyme.example.thymeleaf_practice

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class ContentController {

    @GetMapping("/")
    @ResponseBody
    fun index(): String {
        return "hi"
    }

    @GetMapping("hello")
    fun hello(model: Model): String {
        model.addAttribute("message", "Hello, My name is Mr.Song")
        return "hello"
    }
}