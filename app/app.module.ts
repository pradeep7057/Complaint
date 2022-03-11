import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustShowComponent } from './cust-show/cust-show.component';
import { TicketsComponent } from './tickets/tickets.component';
import { CustLoginComponent } from './cust-login/cust-login.component';
import { MgrLoginComponent } from './mgr-login/mgr-login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { EngrLoginComponent } from './engr-login/engr-login.component';
import { CustDashboardComponent } from './cust-dashboard/cust-dashboard.component';
import { MgrDashboardComponent } from './mgr-dashboard/mgr-dashboard.component';
import { EngrDashboardComponent } from './engr-dashboard/engr-dashboard.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AdminShowComponent } from './admin-show/admin-show.component';
import { MgrShowComponent } from './mgr-show/mgr-show.component';
import { EngrShowComponent } from './engr-show/engr-show.component';
import { HomePageComponent } from './home-page/home-page.component';
import { TicketRaiseComponent } from './ticket-raise/ticket-raise.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';

const appRoutes : Routes = [
  {path:'',component:HomePageComponent},
  {path:'custLogin',component:CustLoginComponent},
  {path:'adminLogin',component:AdminLoginComponent},
  {path:'mgrLogin',component:MgrLoginComponent},
  {path:'engrLogin',component:EngrLoginComponent},
  {path:'custdashboard',component:CustDashboardComponent},
  {path:'engrdashBoard',component:EngrDashboardComponent},
  {path:'mgrdashBoard',component:MgrDashboardComponent},
  
  {path:'admindashboard',component:AdminDashboardComponent,
  children:[
    {path:'showtickets',component:TicketsComponent,outlet:'mphasis'},
  ]
},

{path:'custdashboard',component:CustDashboardComponent,
children:[
  {path:'showtickets',component:TicketsComponent,outlet:'mphasis'},
  {path:'addtickets',component:TicketRaiseComponent,outlet:'mphasis'},
]

},

{path:'engrdashBoard',component:EngrDashboardComponent,
children:[
  {path:'showtickets',component:TicketsComponent,outlet:'mphasis'},
]
},

{path:'mgrdashBoard',component:MgrDashboardComponent,
children:[
  {path:'showtickets',component:TicketsComponent,outlet:'mphasis'},
]
},
];

@NgModule({
  declarations: [
    AppComponent,
    CustShowComponent,
    TicketsComponent,
    CustLoginComponent,
    MgrLoginComponent,
    AdminLoginComponent,
    EngrLoginComponent,
    CustDashboardComponent,
    MgrDashboardComponent,
    EngrDashboardComponent,
    AdminDashboardComponent,
    AdminShowComponent,
    MgrShowComponent,
    EngrShowComponent,
    HomePageComponent,
    TicketRaiseComponent,
    UpdateCustomerComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


