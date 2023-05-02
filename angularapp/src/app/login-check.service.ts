import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginCheckService {
  url ="http://localhost:8093";




    constructor(private http: HttpClient) { }
  
    login(email:any,password:any){
  
  
  
  
       return this.http.post(this.url+'/auth',{
  
       email:email , password: password
  // ,username:null,
  
  //      mobileNumber:null,
  
  //     userId:null,
  
  //     userRole: null
  
     
  
      });
  
    }
}
