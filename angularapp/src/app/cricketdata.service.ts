import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CricketdataService {
  url="http://localhost:8093/referee/getReferee";
  constructor(private htt:HttpClient) { }
  ref(){
    return this.htt.get(this.url);
  }

  url1="http://localhost:8093/referee/addReferee";
  addref(data:any){
    return this.htt.post(this.url1,data);
  
  }

        // deletemapping

      url2="http://localhost:8093/referee/deleteReferee/{refereeID}";
      deleteref(refereeID:number){
        return this.htt.delete("http://localhost:8093/referee/deleteReferee"+`/${refereeID}`);
      }

      //putmapping

// updateReferee(refereeID:number,data:any){
//   return this.htt.put("http://localhost:8093/referee/editReferee"+`/${refereeID}`,data);
// }


}
