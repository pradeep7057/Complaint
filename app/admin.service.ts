import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Admin } from './admin';

@Injectable({
  providedIn: 'root'
})
export class AdminService { 

  constructor(private _http: HttpClient) { }

  showadmin(): Observable<Admin []> {
    return this._http.get<Admin[]>("http://localhost:8087/admins")
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
    }
      searchadmin(aid : number): Observable<Admin> {
        return this._http.get<Admin>("http://localhost:8087/admins/"+aid)
          .pipe(
            tap(data =>
            console.log('All: ' + JSON.stringify(data)))
          );
      }
    }  

