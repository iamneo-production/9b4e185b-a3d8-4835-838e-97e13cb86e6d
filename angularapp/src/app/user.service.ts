import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RegisterComponent } from './register/register.component';

@Injectable({
  providedIn: 'root'
})
export class UserService {
deletevenue(data:any){
  throw new Error('Method not implemented');
}

  constructor(
  private http: HttpClient
  ) { }
  
  registerUser(user: any): Observable<any> {
  const url = `http://localhost:8093/user`;
  return this.http.post(url, user); 
  }

  

  url="http://localhost:8093/venue/getVenue";
  ref(){
    return this.http.get(this.url);
  }
   url1="http://localhost:8093/venue/addVenue";
   add(data:any){
     return this.http.post(this.url1,data);
  }

  url2="http://localhost:8093/venue/deleteVenue";

delete(venueId:number){
alert("service method called");
return this.http.delete("http://localhost:8093/venue/deleteVenue"+`/${venueId}`);

 }

 updatevenue(venueId:number,data:any){
  return this.http.put("http://localhost:8093/venue/editVenue"+`/${venueId}`,data)
}



  }
