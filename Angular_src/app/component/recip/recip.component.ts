import { StoreItemService } from './../../services/storeItem/store-item.service';
import { StoreItem } from 'src/app/model/store-item';
import { RecipService } from './../../services/recip/recip.service';
import { ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { Recip } from 'src/app/model/recip';

@Component({
  selector: 'app-recip',
  templateUrl: './recip.component.html',
  styleUrls: ['./recip.component.css']
})
export class RecipComponent implements OnInit {


recip: Recip[];



  constructor(
    private route: ActivatedRoute,
    private recipService: RecipService,
    ) { }



    ngOnInit() {



       this.recipService.getRecip().subscribe(
         data => {
        this.recip = data;
      });
     }

}
