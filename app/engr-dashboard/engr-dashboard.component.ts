import { Component, OnInit } from '@angular/core';
import { Engr } from '../engr';
import { EngrService } from '../engr.service';

@Component({
  selector: 'app-engr-dashboard',
  templateUrl: './engr-dashboard.component.html',
  styleUrls: ['./engr-dashboard.component.css']
})
export class EngrDashboardComponent implements OnInit {


  eid : number;
  engr : Engr;
  constructor(private _engrservice : EngrService) { 
    this.eid = parseInt(localStorage.getItem("engId"));
    this._engrservice.searchengr(this.eid).subscribe(x => {
      this.engr=x;
    })
  }

  ngOnInit(): void {
  }

}
