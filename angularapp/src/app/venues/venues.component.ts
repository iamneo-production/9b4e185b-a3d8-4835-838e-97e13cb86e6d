import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-venues',
  templateUrl: './venues.component.html',
  styleUrls: ['./venues.component.css']
})
export class VenuesComponent {
  venues:any;
  router: any;
  venueId: any;
  venueName: any;
  venueImageURL: any;
  venueDescription: any;
  venueLocation: any;
  constructor(private userservice:UserService){
    userservice.ref().subscribe((data:any)=>{
      console.log("data",data);
      this.venues=data;
    })

  }
  userForm= new FormGroup(
    {
      venueId:new FormControl('',[Validators.required]),
      venueName:new FormControl('',[Validators.required]),
      venueImageUrl:new FormControl('',[Validators.required]),
      venueDescription:new FormControl('',[Validators.required]),
      venueLocation:new FormControl('',[Validators.required]),
      

    }
  )
  addvenues(data:any){
    this.userservice.add(data).subscribe(res => {console.log(res)});

    console.log(this.userForm.value);
    alert("sucessfully Added");
  }

  deletevenues(data:any){
    alert("function called");
  this.userservice.delete(data).subscribe((res)=>{
    console.log(res);
    alert("console warn called")
    
     })
   }
  update(){
    let updatevenue={
      "id":this.venueId,
      "name":this.venueName,
      "imageurl":this.venueImageURL,
      "description":this.venueDescription,
      "location":this.venueLocation,

    }
    this.userservice.updatevenue(this.venueId,updatevenue).subscribe((res)=>{
      console.warn(res)
    })
  }


}
