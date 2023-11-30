package karmiel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPage {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "О нас");
        return "about";
    }

    @GetMapping("/auto")
    public String auto(Model model) {
        model.addAttribute("title", "Автомобили");
        return "auto";
    }
}
