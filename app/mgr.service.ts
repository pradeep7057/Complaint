import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Mgr } from './mgr';

@Injectable({
  providedIn: 'root'
})
export class MgrService {

  constructor(private _http: HttpClient) { }

  showmgr(): Observable<Mgr []> {
    return this._http.get<Mgr[]>("http://localhost:8087/mgrs")
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  searchmgr(mid : number): Observable<Mgr> {
    return this._http.get<Mgr>("http://localhost:8087/mgrs/"+mid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
}