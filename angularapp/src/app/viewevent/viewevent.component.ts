import { Component } from '@angular/core';
import { EventService } from '../event.service';

@Component({
  selector: 'app-viewevent',
  templateUrl: './viewevent.component.html',
  styleUrls: ['./viewevent.component.css']
})
export class VieweventComponent {
  Event:any;

  constructor(eventdata:EventService){
    eventdata.user().subscribe((data:any)=>{
   console.log("data",data);
   this.Event=data;
 })
   
  }
}
