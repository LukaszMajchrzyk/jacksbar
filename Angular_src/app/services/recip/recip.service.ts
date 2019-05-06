
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Orders } from 'src/app/model/orders';
import { Recip } from 'src/app/model/recip';


@Injectable({
  providedIn: 'root'
})
export class RecipService {

  private recips: Array<string> = [];

  private recipUrl = 'http://localhost:8080/api/test/storeitem/';


  constructor(private http: HttpClient) { }



  public getRecip() {
    return this.http.get<Recip[]>(this.recipUrl);
  }


}
