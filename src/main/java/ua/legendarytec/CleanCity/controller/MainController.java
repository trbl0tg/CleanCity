package ua.legendarytec.CleanCity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
public class MainController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="world!") String name, Model model) {

        model.addAttribute("name", "Hello, " + name);
        return "greeting";
    }

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
