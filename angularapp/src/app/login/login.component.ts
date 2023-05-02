import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { LoginCheckService } from '../login-check.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginError } from '../ErrorSet';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm!: FormGroup;

  email: string='';
  password: string='';
  userRole: string='';
  setrole: string='Organizer';
  url="http://localhost:8093/auth";
  adminurl="http://localhost:8093/auth/admin"
  message: string='Incorrect email or password';
  errormessage: string='';
  
  constructor(
    private fb: FormBuilder,
    private http: HttpClient,
    private router: Router
    ) {}

    ngOnInit(): void {
      this.loginForm = this.fb.group({
        email: ['', [Validators.required, Validators.email]],
        password: ['', Validators.required],
        userRole: ['', Validators.required]
      })
    }
  
  onSubmit() {  
  const user = {
    email: this.loginForm.get('email')?.value,
  password: this.loginForm.get('password')?.value,
  userRole: this.loginForm.get('userRole')?.value
  };
  const role={
    userRole: this.loginForm.get('userRole')?.value
  }
  if(role.userRole===this.setrole){
  this.http.post(this.url, user).subscribe((response) => {
  console.log(response);
  if(response){
  this.router.navigateByUrl('/userhome');
  }
  else{
    this.errormessage=this.message
    throw new LoginError(this.errormessage);
  }
  });
}
else{
  this.http.post(this.adminurl, user).subscribe((response) => {
    console.log(response);
    if(response){
      this.router.navigateByUrl('/adminhome')
    }
    else{
      alert("Credentials mismatched!!!")
    }
    });
}
    }

    
  }


//   this.authService.login(this.email, this.password)
// .subscribe(
// data => {