package ksaito.practice.spring.mvc.service;

import java.util.List;

import ksaito.practice.spring.mvc.entity.Employee;
import ksaito.practice.spring.mvc.form.EmployeeListForm;

public interface EmployeeService {
  List<Employee> getEmployeeList(EmployeeListForm from);
}
