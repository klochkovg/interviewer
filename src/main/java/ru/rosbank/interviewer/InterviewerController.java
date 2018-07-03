package ru.rosbank.interviewer;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

@Controller
public class InterviewerController {

    @RequestMapping(value = "/", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String index() {
        return "<html><body>Greetings from Spring Boot!</body></html>\n";
    }

    @RequestMapping("greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
	model.addAttribute("name",name);
	return "greeting";
    }

}
