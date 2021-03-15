package ksaito.practice.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ksaito.practice.spring.mvc.request.IndexRequest;
import ksaito.practice.spring.mvc.response.IndexResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {
  @GetMapping(path = "/")
  public String get() {
    log.info("GETメソッドできた");
    return "index";
  }

  @CrossOrigin
  @PostMapping(path = "/")
  public @ResponseBody IndexResponse post(@RequestBody IndexRequest request) {
    log.info("POSTメソッドできた");
    log.info("パラメータ:" + request.toString());
    return IndexResponse.builder().inputText(request.getInputText()).build();
  }
}
