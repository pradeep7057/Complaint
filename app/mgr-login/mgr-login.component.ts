import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Mgr } from '../mgr';
import { MgrService } from '../mgr.service';

@Component({
  selector: 'app-mgr-login',
  templateUrl: './mgr-login.component.html',
  styleUrls: ['./mgr-login.component.css']
})
export class MgrLoginComponent implements OnInit {

  mgId : number;
  passCode : string;
  mgr : Mgr[];
  logMe() {
    localStorage.setItem('mgId',this.mgId.toString());
    if (this.passCode=="Mphasis") {
      this._router.navigate(['/mgrdashBoard']);

    }
  }
  constructor(private _router : Router, private _mgrservice :MgrService) {
    this._mgrservice.showmgr().subscribe({
      next: rs =>{
        this.mgr = rs;
      }
    })
   }
  ngOnInit(): void {
  }

}
