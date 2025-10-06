package com.chakri.springweb2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.chakri.springweb2.service.jobService;

import org.springframework.ui.Model;

@Controller
public class HomeController {
	@Autowired
    private jobService service; 

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
        service.addJob(jp);
        return "success"; // forwards to success.jsp
    }
    @GetMapping("/viewalljobs")
    public String viewJobs(Model m) {
        System.out.println("View all jobs method called");
        List<JobPost> jobs = service.getALLJobs();
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }
}
