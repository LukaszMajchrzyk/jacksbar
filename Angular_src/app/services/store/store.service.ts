import { Store } from './../../model/store.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StoreService {

  private stores: Array<string> = [];

  store: Store = new Store();

  private helloWorldUrl = 'http://localhost:8080/api/test/hello/';
  private storeUrl = 'http://localhost:8080/api/test/store/';


  constructor(private http: HttpClient) { }


  public getTest() {
    const url = 'http://localhost:8080/api/test/employee/';
    return this.http.get(url, {responseType: 'text'});
  }


  public getHeroes() {
    return this.http.get<Store[]>(this.storeUrl);
  }

public addStore(store) {
  return this.http.post<Store>(this.storeUrl, store);

  // return this.http.post<Store>(this.storeUrl, JSON.stringify(store));
}

  public deleteStore(store) {
    return this.http.delete(this.storeUrl + '/' + store.store_id);
  }

}










