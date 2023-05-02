import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CricketdataService } from '../cricketdata.service';

@Component({
  selector: 'app-referee',
  templateUrl: './referee.component.html',
  styleUrls: ['./referee.component.css']
})
export class RefereeComponent {
  refereeID:any;
  refereeName:any;
  noOfMatches:any;
  ref:any;
  currentId: any;
  
  constructor(private userdata:CricketdataService){
    userdata.ref().subscribe((data:any)=>{
      console.log("data",data);
      this.ref=data;
    })
  }

  userForm= new FormGroup(
        {
      refereeId:new FormControl('',[Validators.required]),
       refereeName:new FormControl('',[Validators.required]),
          noOfMatches:new FormControl('',[Validators.required]),
        }
    
      )

  addref(data:any){
    
    this.userdata.addref(data).subscribe(result => {console.log(result)});
      console.log(this.userForm.value);
    alert("added successfully");
    }

    deleteReferee(data:any){
      this.userdata.deleteref(data).subscribe((result)=>{
        console.warn(result);
        alert("deleted succesfully");
      })
        
      }

      // edit(referee:any){
      //   this.refereeID=referee.refereeID;
      //   this.refereeName=referee.refereeName;
      //   this.noOfMatches=referee.noOfMatches;
      //   this.currentId=referee.currentId
        
      // }
      // update(){
      //   let updateReferee={
      //     "id":this.refereeID,
      //     "name":this.refereeName,
      //     "noOfMatches":this.noOfMatches,
      //   }
      //   this.userdata.updateReferee(this.currentId,updateReferee).subscribe((res)=>{
      //     console.warn(res)
      //   })
      // }


}
