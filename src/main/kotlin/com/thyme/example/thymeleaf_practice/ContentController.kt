package com.thyme.example.thymeleaf_practice

import com.thyme.example.thymeleaf_practice.medel.User
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

    @GetMapping("user")
    fun user(model: Model): String {
        val userList = listOf<User>(
            User(1, "Woody", "syg1138@gmail.com"),
            User(2, "Bruno", "bruno8@gmail.com"),
            User(3, "Laura", "laura@gmail.com")
        )
        model.addAttribute("userList", userList)

        return "user-list"
    }
}