import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Engr } from './engr';

@Injectable({
  providedIn: 'root'
})
export class EngrService {

  constructor(private _http: HttpClient) { }

  showengr(): Observable<Engr []> {
    return this._http.get<Engr[]>("http://localhost:8087/engrs")
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  } 
searchengr(eid : number): Observable<Engr> {
  return this._http.get<Engr>("http://localhost:8087/engrs/"+eid)
    .pipe(
      tap(data =>
      console.log('All: ' + JSON.stringify(data)))
    );
}
}