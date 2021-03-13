package ksaito.practice.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ksaito.practice.spring.mvc.input.IndexInputForm;
import ksaito.practice.spring.mvc.output.IndexOutputForm;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {
  @GetMapping(path = "/")
  public String get() {
    log.info("GETメソッドできた");
    return "index";
  }

  @GetMapping(params = "/")
  public IndexOutputForm post(@RequestBody IndexInputForm form) {
    log.info("POSTメソッドできた");
    return IndexOutputForm.builder().inputText(form.getInputText()).build();
  }
}
