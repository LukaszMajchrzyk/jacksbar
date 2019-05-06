package tk.jewsbar.jwtauth.app.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Employee {

    @Id
    @GeneratedValue
   private Long idemployee;

    @Basic
    private String name;
    @Basic
    private String surename;
    @Basic
    private String role;



    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)

   private Set <EmployeeHours> employeehours;




    public Long getIdemployee() {
        return idemployee;
    }

    public void setIdemployee(Long idemployee) {
        this.idemployee = idemployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<EmployeeHours> getEmployeehours()
    {
        return employeehours;
    }

    public void setEmployeehours(Set<EmployeeHours> employeehours) {
        this.employeehours = employeehours;
    }
}
