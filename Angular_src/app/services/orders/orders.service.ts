import { Store } from './../../model/store.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Orders } from 'src/app/model/orders';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  private orders: Array<string> = [];

  private ordersUrl = 'http://localhost:8080/api/test/recip/';
  private orderoUrl = 'http://localhost:8080/api/test/orders/';


  constructor(private http: HttpClient) { }


  getTest(): Observable<string> {
    return this.http.get(this.ordersUrl, { responseType: 'text' });
  }


  public getOrders() {
    return this.http.get<Orders[]>(this.ordersUrl);
  }

  public getOrderss() {
    return this.http.get<Orders[]>(this.orderoUrl);
  }

  public addOrders(order) {
    return this.http.post<Orders>(this.orderoUrl, order);
  }

}










