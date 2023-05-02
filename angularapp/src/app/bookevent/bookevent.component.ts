import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { EventService } from '../event.service';

@Component({
  selector: 'app-bookevent',
  templateUrl: './bookevent.component.html',
  styleUrls: ['./bookevent.component.css']
})
export class BookeventComponent {
  Event:any;
  venueName: any;

  constructor(private eventdata:EventService){
    eventdata.user().subscribe((data:any)=>{
   console.log("data",data);
   this.Event=data;
 })
   
  }
 AdminForm = new FormGroup(
 {
  // eventId: new FormControl('',[Validators.required]),
  eventName : new FormControl('',[Validators.required]),
  applicantName: new FormControl('',[Validators.required]),
  applicantAddress: new FormControl('',[Validators.required]),
  refereeName: new FormControl('',[Validators.required]),
  venueName:new FormControl('',[Validators.required]),
  eventFromDate: new FormControl('',[Validators.required]),
  eventToDate:new FormControl('',[Validators.required]),


 }
 )
 addEvent(data:any){
   
   this.eventdata.addEvent(data).subscribe((result: any) => {
     console.log(result);
   })
   console.log(this.AdminForm.value);
   alert("Sucessfully Added");
 }


}
