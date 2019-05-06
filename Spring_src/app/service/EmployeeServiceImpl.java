package tk.jewsbar.jwtauth.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.jewsbar.jwtauth.app.model.Employee;
import tk.jewsbar.jwtauth.app.repository.EmployeeRepository;

import java.util.List;

@Service("employeeService")
@Transactional

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    //@Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

}
