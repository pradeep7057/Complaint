import { Component, OnInit } from '@angular/core';
import { Mgr } from '../mgr';
import { MgrService } from '../mgr.service';

@Component({
  selector: 'app-mgr-show',
  templateUrl: './mgr-show.component.html',
  styleUrls: ['./mgr-show.component.css']
})
export class MgrShowComponent implements OnInit {


    mgr : Mgr[];
    constructor(private _mgrservice : MgrService) {
      this._mgrservice.showmgr().subscribe({
        next: rs =>{
          this.mgr = rs;
        }
      })
     }
  
    ngOnInit(): void {
    }
  
  }
