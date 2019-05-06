import { AddStoreComponent } from './../component/add-store/add-store.component';
import { getTestBed } from '@angular/core/testing';
import { StoreService } from './../services/store/store.service';

import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Store } from '../model/store.model';



@Component({
  selector: 'app-store',
  templateUrl: './store.component.html',
  styleUrls: ['./store.component.css']
})
export class StoreComponent implements OnInit {
  stores: string;
  hellos: string;

info: any;
storess: Store[];




  constructor(
    private route: ActivatedRoute,
    private storeService: StoreService,
    ) { }



    ngOnInit() {

      this.storeService.getHeroes().subscribe(
        data => {
       this.storess = data;
     });
    }




  deleteStore(store: Store): void {
    this.storeService.deleteStore(store)
      .subscribe( data => {
        this.storess = this.storess.filter(u => u !== store);
      });
  }


getTests() {
        this.storeService.getTest().subscribe(
          data => {
         this.info = data;
       });
      }








  handleSuccessFullResponse(response) {
    console.log(response);
  }


}
