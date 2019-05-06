package tk.jewsbar.jwtauth.app.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import tk.jewsbar.jwtauth.app.model.Employee;

import java.util.List;

@EnableAutoConfiguration
@Service
public interface EmployeeService {

    List<Employee> findAll();

    Employee create(Employee employee);


}
