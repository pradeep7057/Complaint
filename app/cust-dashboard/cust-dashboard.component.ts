import { Component, OnInit } from '@angular/core';
import { Cust } from '../cust';
import { CustService } from '../cust-service.service';

@Component({
  selector: 'app-cust-dashboard',
  templateUrl: './cust-dashboard.component.html',
  styleUrls: ['./cust-dashboard.component.css']
})
export class CustDashboardComponent implements OnInit {

  cid : number;
  cust : Cust;
  constructor(private _custService : CustService) { 
    this.cid = parseInt(localStorage.getItem("custId"));
    this._custService.searchCustomer(this.cid).subscribe(x => {
      this.cust=x;
    })
//    this.customer = this._customerService.searchCustomer(this.cid);
  }

  ngOnInit(): void {
  }

}
