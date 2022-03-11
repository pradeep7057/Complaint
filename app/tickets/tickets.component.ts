import { Component, OnInit } from '@angular/core';
import { Tickets } from '../tickets';
import { TicketsService } from '../tickets.service';

@Component({
  selector: 'app-tickets',
  templateUrl: './tickets.component.html',
  styleUrls: ['./tickets.component.css']
})
export class TicketsComponent implements OnInit {

  tickets : Tickets[];
  constructor(private _ticketsservice : TicketsService) {
    this._ticketsservice.showtickets().subscribe({
      next: rs =>{
        this.tickets = rs;
      }
    })
   }

  ngOnInit(): void {
  }

}