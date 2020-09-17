package ksaito.practice.spring.mvc.form;

import java.util.List;

import ksaito.practice.spring.mvc.entity.Employee;
import lombok.Getter;
import lombok.Setter;

import static java.util.Objects.isNull;

@Getter
@Setter
public class EmployeeListForm {
  private List<Integer> employeeIds;
  private List<String> employeeNames;
  private List<Integer> departmentIds;
  private List<String> departmentNames;
  private List<Employee> employees;

  /**
   * 検索条件がないかどうか.
   * @return .
   */
  public boolean isNoCondition() {
    return (
      isNull(employeeIds) || employeeIds.isEmpty()
    )
      && (
      isNull(employeeNames) || employeeNames.isEmpty()
    )
      && (
      isNull(departmentIds) || departmentIds.isEmpty()
    )
      && (
      isNull(departmentNames) || departmentNames.isEmpty()
    );
  }
}
