package ksaito.practice.spring.mvc.controller;

import ksaito.practice.spring.mvc.form.EmployeeListForm;
import ksaito.practice.spring.mvc.service.EmployeeService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @RequestMapping(path = "employee")
  public String employee() {
    return "employee/list";
  }

  @GetMapping(path = "/employee/list")
  public String list(Model model, EmployeeListForm form) {
    val emp = employeeService.getEmployeeList(form);
    model.addAttribute("employees", emp);
    return "employee";
  }
}
