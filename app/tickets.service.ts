import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Tickets } from './tickets';

@Injectable({
  providedIn: 'root'
})
export class TicketsService {
  showmgr(mgr_Id: any) {
    throw new Error('Method not implemented.');
  }

  constructor(private _http: HttpClient) { }

  showtickets(): Observable<Tickets []> {
    return this._http.get<Tickets[]>("http://localhost:8087/tickets")
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  addtickets(tickets : Tickets) : Observable<string> {
    return this._http.post<string>("http://localhost:8087/addtickets",tickets)
  }
  addtickets1(tickets : Tickets) : Observable<any> {
    return this._http.post<string>("http://localhost:8087/addtickets",tickets).
    pipe(tap(data => data.toString()))
  }
}