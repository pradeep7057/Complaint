import { Component, OnInit } from '@angular/core';
import { Cust } from '../cust';
import { CustService } from '../cust-service.service';


@Component({
  selector: 'app-cust-show',
  templateUrl: './cust-show.component.html',
  styleUrls: ['./cust-show.component.css']
})
export class CustShowComponent implements OnInit {

  custs : Cust[];
  constructor(private _custService : CustService) {
    this._custService.showCust().subscribe({
      next: rs =>{
        this.custs = rs;
      }
    })
   }

  ngOnInit(): void {
  }

}
