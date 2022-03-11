import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Cust } from './cust';

@Injectable({
  providedIn: 'root'
})
export class CustService { 

  constructor(private _http: HttpClient) { }

  showCust(): Observable<Cust []> {
    return this._http.get<Cust[]>("http://localhost:8087/custs")
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  searchCustomer(cid : number): Observable<Cust> {
    return this._http.get<Cust>("http://localhost:8087/custs/"+cid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
}
