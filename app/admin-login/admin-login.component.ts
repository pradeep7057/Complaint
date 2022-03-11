import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  adminId : number;
  passCode : string;
  admin : Admin[];
  logMe() {
    localStorage.setItem('adminId',this.adminId.toString());
    if (this.passCode=="Mphasis") {
      this._router.navigate(['/admindashboard']);

    }
  }
  constructor(private _router : Router, private _adminservice :AdminService) {
    this._adminservice.showadmin().subscribe({
      next: rs =>{
        this.admin = rs;
      }
    })
   }
  ngOnInit(): void {
  }

}
