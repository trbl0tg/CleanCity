package ua.legendarytec.CleanCity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.legendarytec.CleanCity.domains.Report;
import ua.legendarytec.CleanCity.domains.User;
import ua.legendarytec.CleanCity.repos.ReportRepo;

import java.security.Principal;

@Controller
public class MainController {


    @Autowired
    private ReportRepo reportRepo;

    @GetMapping
    public String main(Model model){

        Iterable<Report> reports = reportRepo.findAll();
        model.addAttribute("reports", reports);
        return "main";
    }



    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="world!") String name, @AuthenticationPrincipal User user, Model model) {

        model.addAttribute("name", "Hello, " + user.getName());
        return "greeting";
    }

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
