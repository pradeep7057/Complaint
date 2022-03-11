import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Engr } from '../engr';
import { EngrService } from '../engr.service';

@Component({
  selector: 'app-engr-login',
  templateUrl: './engr-login.component.html',
  styleUrls: ['./engr-login.component.css']
})
export class EngrLoginComponent implements OnInit {

  engId : number;
  passCode : string;
  engr : Engr[];
  logMe() {
    localStorage.setItem('engId',this.engId.toString());
    if (this.passCode=="Mphasis") {
      this._router.navigate(['/engrdashBoard']);

    }
  }
  constructor(private _router : Router, private _engrservice :EngrService) {
    this._engrservice.showengr().subscribe({
      next: rs =>{
        this.engr = rs;
      }
    })
   }
  ngOnInit(): void {
  }

}
