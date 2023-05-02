import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { VenuesComponent } from './venues/venues.component';
import{HttpClient,HttpClientModule}from '@angular/common/http';
import { RefereeComponent } from './referee/referee.component';
import { TeamsComponent } from './teams/teams.component';
import { BookeventComponent } from './bookevent/bookevent.component';
import { VieweventComponent } from './viewevent/viewevent.component';

const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'login',component:LoginComponent},
  {path:'userhome',component:UserhomeComponent},
  {path:'adminhome',component:AdminhomeComponent},
  {path:'venues',component:VenuesComponent},
  {path:'referee',component:RefereeComponent},
  {path:'teams',component:TeamsComponent},
  {path:'bookevent',component:BookeventComponent},
  {path:'viewbookedevent',component:VieweventComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],

  exports: [RouterModule]
})
export class AppRoutingModule { }
