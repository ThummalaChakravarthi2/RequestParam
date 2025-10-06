package com.chakri.springweb2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping({"/","/home"})
    public String home() {
        System.out.println("Home method called");
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob() {
        System.out.println("add job called");
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleform(@ModelAttribute JobPost jp, Model model) {
        // Add the JobPost object to the model
        model.addAttribute("JobPost", jp);

        System.out.println("Form submitted: " + jp);
        return "success"; // forwards to success.jsp
    }
}
