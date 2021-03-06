package ksaito.practice.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
  @GetMapping(path = "/")
  public String index(Model model) {
    model.addAttribute("message", "とりあえず");
    return "index";
  }
}