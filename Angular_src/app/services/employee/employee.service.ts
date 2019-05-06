
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from 'src/app/model/employee.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {



  private employeeUrl = 'http://localhost:8080/api/test/employee/';
  private helloUrl = 'http://localhost:8080/api/test/store/';


  constructor(private http: HttpClient) { }


  public getEmployees() {
    return this.http.get<Employee[]>(this.employeeUrl);
  }


  getTest(): Observable<string> {
    return this.http.get(this.helloUrl, { responseType: 'text' });
  }


  public deleteEmployee(employee) {
    return this.http.delete(this.employeeUrl + '/' + employee.id);
  }


// public addStore(store) {
//   return this.http.post<Store>(this.storeUrl, store);
// }

//   public deleteStore(store) {
//     return this.http.delete(this.storeUrl + '/' + store.store_id);
//   }












}
