package kr.ac.kopo.idsdk.exam2026.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.bind.annotation.GetMapping;
import org.springframework.bind.annotation.PostMapping;
import org.springframework.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam09_01")
public class Chap09_01Controller {
    @GetMapping
    public String showForm(Model model){
        model.addAttribute("product", new Product());
        return "viewPage09_01.html";
    }

    @PostMapping
    public String submitForm(@Valid @ModelAttribute Product product, BindingResult bindingResult) {
        return "viewPage09_01.html";
    }
    return "viewPage09_01";
}
