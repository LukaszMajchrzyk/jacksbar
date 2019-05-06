package tk.jewsbar.jwtauth.app.repository;

import java.sql.Timestamp;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tk.jewsbar.jwtauth.app.model.EmployeeHours;

@Repository
public interface EmployeeHoursRepository  extends JpaRepository<EmployeeHours, Long> {

    Optional<EmployeeHours> findByDate(Timestamp date);


}
