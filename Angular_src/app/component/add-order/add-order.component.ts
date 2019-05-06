import { getTestBed } from '@angular/core/testing';
import { StoreService } from './../../services/store/store.service';

import { Component, OnInit, } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';


import { Output, EventEmitter } from '@angular/core';
import { Orders } from 'src/app/model/orders';
import { OrdersService } from 'src/app/services/orders/orders.service';



  @Component({
    selector: 'app-add-order',
    templateUrl: './add-order.component.html',
    styleUrls: ['./add-order.component.css']
  })
  export class AddOrderComponent implements OnInit {

    show: boolean;

    @Output() myClick = new EventEmitter();

    orders: Orders[];
    order: Orders = new Orders();

  constructor(
    private route: ActivatedRoute,
    private ordersService: OrdersService,
    private router: Router,
    ) { }


    ngOnInit() {
      this.ordersService.getOrders().subscribe(
        data => {
       this.orders = data;
     });

    }



  ifShow() {
    this.show = !this.show;

  }

  createOrders(): void {
    this.ordersService.addOrders(this.order)
        .subscribe( data => {

          window.location.reload();
        });





  }
  }
