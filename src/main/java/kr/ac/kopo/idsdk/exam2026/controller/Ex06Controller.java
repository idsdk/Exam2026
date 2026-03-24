package kr.ac.kopo.idsdk.exam2026.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Exam06Controller {
    @GetMapping("/exam06")
    public String requestMethod(Model model){
        model.addAttribute("title", "Model 유형연습1");
        model.addAttribute("title", "Model 유형연습1");
        return "viewPage";
    }
}
