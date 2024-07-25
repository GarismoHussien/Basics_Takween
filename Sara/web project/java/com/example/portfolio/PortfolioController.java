
package com.example.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "portfolio";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
