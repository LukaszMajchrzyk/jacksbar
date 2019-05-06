

import { Component, OnInit } from '@angular/core';
import { StoreItemService } from './../../services/storeItem/store-Item.service';
import { ActivatedRoute } from '@angular/router';
import { StoreItem } from 'src/app/model/store-item';

@Component({
  selector: 'app-store-item',
  templateUrl: './store-item.component.html',
  styleUrls: ['./store-item.component.css']
})
export class StoreItemComponent implements OnInit {

storeItem: StoreItem[];


  constructor(
    private route: ActivatedRoute,
    private storeItemService: StoreItemService,
    ) { }

  ngOnInit() {

    this.storeItemService.getStoreItems().subscribe(
      data => {
     this.storeItem = data;
   });
  }



}

