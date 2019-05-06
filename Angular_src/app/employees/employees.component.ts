import { EmployeeService } from './../services/employee/employee.service';


import { getTestBed } from '@angular/core/testing';

import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from 'src/app/model/employee.model';




@Component({
  selector: 'app-employee',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {




info: string;

employee: Employee[];

employees: Employee[];

public values: any;

  constructor(
    private route: ActivatedRoute,
    private employeeService: EmployeeService,
    ) { }


      ngOnInit() {

        this.employeeService.getEmployees().subscribe(
          data => {
         this.employee = data;
       });
      }


      getTests() {
          this.employeeService.getTest().subscribe(
            data => {
              this.info = data;
            });
          }

          deleteEmployee(employeeo: Employee): void {
            this.employeeService.deleteEmployee(employeeo)
              .subscribe( data => {
                this.employees = this.employees.filter(u => u !== employeeo);
              });
          }


  handleSuccessFullResponse(response) {
    console.log(response);
  }



}
