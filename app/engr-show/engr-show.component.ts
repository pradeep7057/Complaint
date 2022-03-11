import { Component, OnInit } from '@angular/core';
import { Engr } from '../engr';
import { EngrService } from '../engr.service';

@Component({
  selector: 'app-engr-show',
  templateUrl: './engr-show.component.html',
  styleUrls: ['./engr-show.component.css']
})
export class EngrShowComponent implements OnInit {


    engr : Engr[];
    constructor(private _engrservice : EngrService) {
      this._engrservice.showengr().subscribe({
        next: rs =>{
          this.engr = rs;
        }
      })
     }
  
    ngOnInit(): void {
    }
  
  }
