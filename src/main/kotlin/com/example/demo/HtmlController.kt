package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

/**
 * @author Geonguk Han
 * @since 2020-04-05
 */
@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }
}