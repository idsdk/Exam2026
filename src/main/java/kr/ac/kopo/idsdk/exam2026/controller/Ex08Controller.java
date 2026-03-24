package kr.ac.kopo.idsdk.exam2026.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex08Controller {
    @GetMapping("/exam08")
    public ModelAndView requestMethod1()
    {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("title1", "ModelAndView 연습");
        modelView.addObject("title2", "ModelAndView addObject()와 setViewName()을 사용");
        modelView.setViewName("viewPage");
        return modelView;
    }
}
