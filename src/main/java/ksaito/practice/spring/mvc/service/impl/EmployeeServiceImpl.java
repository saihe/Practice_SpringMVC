package ksaito.practice.spring.mvc.service.impl;

import java.util.List;

import ksaito.practice.spring.mvc.entity.Employee;
import ksaito.practice.spring.mvc.form.EmployeeListForm;
import ksaito.practice.spring.mvc.repository.EmployeeRepository;
import ksaito.practice.spring.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public List<Employee> getEmployeeList(EmployeeListForm from) {
    return employeeRepository.findAll();
  }
}
