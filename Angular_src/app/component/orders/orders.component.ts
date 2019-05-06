import { OrdersService } from './../../services/orders/orders.service';
import { Orders } from './../../model/orders';

import { getTestBed } from '@angular/core/testing';

import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';




@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {

  info: string;

orders: Orders[];




  constructor(
    private route: ActivatedRoute,
    private ordersService: OrdersService,
    ) { }



    ngOnInit() {



       this.ordersService.getOrders().subscribe(
         data => {
        this.orders = data;
      });
     }




    getTests() {
      this.ordersService.getTest().subscribe(
        data => {
          this.info = data;
        });
      }



  handleSuccessFullResponse(response) {
    console.log(response);
  }


}
