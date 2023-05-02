import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TeamService {

  url= "http://localhost:8093";

 constructor(private http:HttpClient) { }
saveTeams(data:any){

  return this.http.post(this.url+'/Team/addTeam',data);
}

 users(){
   return this.http.get(this.url+'/Team/getTeam');
   }

   delete(teamId:number){
    return this.http.delete(this.url+'/Team/deleteTeam'+`/${teamId}`);
   }

  }


