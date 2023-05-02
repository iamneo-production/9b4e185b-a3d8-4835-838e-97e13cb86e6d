import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { TeamService } from '../team.service';

@Component({
  selector: 'app-teams',
  templateUrl: './teams.component.html',
  styleUrls: ['./teams.component.css']
})
export class TeamsComponent {
  Team:any;
  router:any;
  // teamId:any;
  // teamName:any;
  // nofplayers:any;
  // teamcaptain:any;
  // teamvicecaptain:any;
  // teamlocation:any;
  constructor(private teamdata:TeamService){
   teamdata.users().subscribe((data:any)=>{
  console.log("data",data);
  this.Team=data;
})
  
 }
AdminForm = new FormGroup(
{
  TeamName: new FormControl('',[Validators.required]),
  Nofplayers: new FormControl('',[Validators.required]),
  TeamCaptain: new FormControl('',[Validators.required]),
  TeamViceCaptain: new FormControl('',[Validators.required]),
  Teamlocation: new FormControl('',[Validators.required]),
}
)
addTeam(data:any){
  
  this.teamdata.saveTeams(data).subscribe((result: any) => {
    console.log(result)
  })
  console.log(this.AdminForm.value);
  alert("Sucessfully Added");
}

deleteTeam(data:any){
this.teamdata.delete(data).subscribe((result:any)=>{
  console.warn(result);
})
}
// update(data:any){
//   this.teamdata.
// }

}



