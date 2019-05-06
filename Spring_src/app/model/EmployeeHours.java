package tk.jewsbar.jwtauth.app.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "employeehours")
public class EmployeeHours {

    @Id
    @GeneratedValue
    private Long idemployeehours;

    private Timestamp date;

    private double quantity;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_idemployee", nullable = false)

    private Employee employee;


    public Long getIdemployeehours() {
        return idemployeehours;
    }

    public void setIdemployeehours(Long idemployeehours) {
        this.idemployeehours = idemployeehours;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
