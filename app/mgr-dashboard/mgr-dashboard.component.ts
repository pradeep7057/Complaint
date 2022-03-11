import { Component, OnInit } from '@angular/core';
import { Mgr } from '../mgr';
import { MgrService } from '../mgr.service';

@Component({
  selector: 'app-mgr-dashboard',
  templateUrl: './mgr-dashboard.component.html',
  styleUrls: ['./mgr-dashboard.component.css']
})
export class MgrDashboardComponent implements OnInit {

  mid : number;
  mgr : Mgr;
  constructor(private _mgrservice : MgrService) { 
    this.mid = parseInt(localStorage.getItem("mgId"));
    this._mgrservice.searchmgr(this.mid).subscribe(x => {
      this.mgr=x;
    })
  }

  ngOnInit(): void {
  }

}
