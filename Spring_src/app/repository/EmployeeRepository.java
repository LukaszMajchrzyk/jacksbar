package tk.jewsbar.jwtauth.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tk.jewsbar.jwtauth.app.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {


    Optional<Employee> findByName(String name);


}
