import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EventService {
  

  url= "http://localhost:8093";

 constructor(private http:HttpClient) { }
addEvent(data:any){

  return this.http.post(this.url+'/event/user/bookEvent',data);
}
user(){
  return this.http.get(this.url+'/event/user/getSchedule')
}
}
