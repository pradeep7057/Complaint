import { Component, OnInit } from '@angular/core';
import { Cust } from '../cust';
import { Mgr } from '../mgr';
import { Engr } from '../engr';
import { Tickets } from '../tickets';
import { CustService } from '../cust-service.service';
import { MgrService } from '../mgr.service';
import { EngrService } from '../engr.service';
import { TicketsService } from '../tickets.service';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-ticket-raise',
  templateUrl: './ticket-raise.component.html',
  styleUrls: ['./ticket-raise.component.css']
})
export class TicketRaiseComponent implements OnInit {

  result : any;
  res : string;
  tickets: any;
  mgrname: any;

  insert(addtickets : NgForm){

    alert("Hi");
    this.tickets.cust_Id = this.custId;
    alert(this.tickets.mgr_Id);
    this._ticketsservice.addtickets1(this.tickets).subscribe(x =>{
      this.result=x;
  
   })
  alert(this.result);
  }  
  showm() {
    alert(this.tickets.mgr_Id);
    this._ticketsservice.showmgr(this.tickets.mgr_Id).subscribe(x => {
      this.mgrname = x.mgrname;
    })
  }
custId :number;

constructor(private _ticketsservice:TicketsService){
this.tickets=new Tickets();
this.custId=parseInt(localStorage.getItem("custId"))

  }


ngOnInit(): void {
}

}
