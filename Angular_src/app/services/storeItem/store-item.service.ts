
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StoreItem } from 'src/app/model/store-item';

@Injectable({
  providedIn: 'root'
})
export class StoreItemService {

  private url = 'http://localhost:8080/api/test/storeitem/';
  private urlHello = 'http://localhost:8080/api/test/hello/';


  constructor(private http: HttpClient) { }

  public getStoreItems() {
    return this.http.get<StoreItem[]>(this.url);
  }

}








