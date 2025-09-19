package com.chakri.springweb2;

import org.springframework.stereotype.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index";
    }
//    @RequestMapping("add")
//   public String add(HttpServletRequest req,HttpSession session) {
//	   System.out.println("add method called");
//	   int num1=Integer.parseInt(req.getParameter("num1"));
//	   
//	   int num2 = Integer.parseInt(req.getParameter("num2"));
//	   int result=num1+num2;
//	   session.setAttribute("result", result);
//	   System.out.println(result);
//	   return "result";
//   }
    @RequestMapping("add")
    public String add(@RequestParam("num1")int firstnumber,int num2,HttpSession session) {
 	   System.out.println("add method called");
 	   
 	   int result=firstnumber+num2;
 	   session.setAttribute("result", result);
 	   return "result";
    }
}
