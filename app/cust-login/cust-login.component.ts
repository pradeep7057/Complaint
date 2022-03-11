import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cust } from '../cust';
import { CustService } from '../cust-service.service';

@Component({
  selector: 'app-customer-login',
  templateUrl: './cust-login.component.html',
  styleUrls: ['./cust-login.component.css']
})
export class CustLoginComponent implements OnInit {

  custId : number;
  passCode : string;
  cust : Cust[];
  logMe() {
    localStorage.setItem('custId',this.custId.toString());
    if (this.passCode=="Mphasis") {
      this._router.navigate(['/custdashboard']);

    }
  }
  constructor(private _router : Router, private _custService :CustService) {
    this._custService.showCust().subscribe({
      next: rs =>{
        this.cust = rs;
      }
    })
   }
  ngOnInit(): void {
  }

}
