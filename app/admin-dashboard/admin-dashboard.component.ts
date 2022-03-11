import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  aid : number;
  admin : Admin;
  constructor(private _adminservice : AdminService) { 
    this.aid = parseInt(localStorage.getItem("adminId"));
    this._adminservice.searchadmin(this.aid).subscribe(x => {
      this.admin=x;
    })
//    this.customer = this._adminService.searchadmin(this.cid);
  }

  ngOnInit(): void {
  }

}
