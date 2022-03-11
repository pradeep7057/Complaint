import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin-show',
  templateUrl: './admin-show.component.html',
  styleUrls: ['./admin-show.component.css']
})
export class AdminShowComponent implements OnInit {

  admin : Admin[];
  constructor(private _adminservice : AdminService) {
    this._adminservice.showadmin().subscribe({
      next: rs =>{
        this.admin = rs;
      }
    })
   }

  ngOnInit(): void {
  }

}
