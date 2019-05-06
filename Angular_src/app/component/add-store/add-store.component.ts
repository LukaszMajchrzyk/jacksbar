import { getTestBed } from '@angular/core/testing';
import { StoreService } from './../../services/store/store.service';

import { Component, OnInit, } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Store } from '../../model/store.model';


import { Output, EventEmitter } from '@angular/core';



  @Component({
    selector: 'app-add-store',
    templateUrl: './add-store.component.html',
    styleUrls: ['./add-store.component.css']
  })
  export class AddStoreComponent implements OnInit {

    show: boolean;

    @Output() myClick = new EventEmitter();

    store: Store = new Store();


  constructor(
    private route: ActivatedRoute,
    private storeService: StoreService,
    private router: Router,
    ) { }


    ngOnInit() {
    }



  ifShow() {
    this.show = !this.show;

  }

  createStores(): void {
    this.storeService.addStore(this.store)
        .subscribe( data => {

          window.location.reload();
        });






  }
  }
