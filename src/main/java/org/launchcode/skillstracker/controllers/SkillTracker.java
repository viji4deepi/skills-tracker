package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillTracker {



    @GetMapping
    @ResponseBody
    public String homePage(){
        String htmlPage = "<html>" +
                "<body>" +
                "<h1>Skill Tracker</h1>" +
                "<h2>We have few skills to learn!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return htmlPage;
    }


    @GetMapping("/form")
   //@RequestMapping(value = "form")
    public String helloForm1(){
        return "formSkill";
    }

    @PostMapping("/form")
     @ResponseBody
    public String formSubmit(@RequestParam String name,@RequestParam String firstLanguage,
                             @RequestParam String secondLanguage,
                             @RequestParam String thirdLanguage){
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<h1>language</h1>" +
                "<table>" +
                " <tr><th>First</th><th>Second</th><th>Third</th></tr>" +
                "<tr><td>"+firstLanguage+"</td><td>"
                +secondLanguage+"</td><td>"
                +thirdLanguage+"</td></tr>" +

//                "<li>"+firstLanguage+"</li>" +
//                "<li>"+secondLanguage+"</li>" +
//                "<li>"+thirdLanguage+"</li>" +
                "</table>" +
                "</body>" +
                "</html>";

    }



}
