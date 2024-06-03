package sky.pro.Employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.Employee.model.Employee;
import sky.pro.Employee.service.EmployeeService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("min-salary")
    public Employee getEmployeeWithMinSalary(int departmentId){
      return employeeService.getEmployeeWithMinSalary(departmentId);
   }
    @GetMapping("max-salary")
    public Employee getEmployeeWithMaxSalary(int departmentId){
        return employeeService.getEmployeeWithMaxSalary(departmentId);
    }
    @GetMapping("all")
    public List<Employee> getAllEmployees(int departmentId){
        return employeeService.getAllEmployees(departmentId);

    }
    @GetMapping("all-grouped")
    public Map<Integer,List<Employee>> getAllEmployeesGroupByDepartment(){
        return employeeService.getAllEmployeesGroupByDepartment();
    }
}
