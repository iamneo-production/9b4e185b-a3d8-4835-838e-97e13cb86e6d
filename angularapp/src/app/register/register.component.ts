import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { __values } from 'tslib';
import { UserService } from '../user.service';
import { PasswordError } from '../ErrorSet';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
// export class RegisterComponent {
//   constructor(private http: HttpClient) {}

//   options=[
//     {label: 'User',value:'User'},
//     {label: 'Admin',value:'Admin'}
//   ]
//   email: string='';
//   password: string='';
//   username: string='';
//   mobileNumber: string='';
//   userRole: string='';
//   confirmPassword: string='';

//   url="http://localhost:8093/user";

  

//   onSubmit() {
//     const user = { userRole: this.options,email: this.email, password: this.password, username: this.username, mobileNumber: this.mobileNumber };
    // const userCheck={confirmPassword: this.confirmPassword};
    // if(userCheck.confirmPassword===user.password){
    // this.http.post<any>(this.url, user).subscribe((response) => {
    // console.log(response);
    // alert("New user added");
    // });
  // }
  // else{
  //   alert("Confirm password not matching password");
  // }
//     

export class RegisterComponent implements OnInit {
  message: string='Confirm Password should match the password';
  errormessage: string='';
  message1: string='Email/Username already taken'

  registrationForm!: FormGroup;
  
  constructor(
  private fb: FormBuilder,
  private userService: UserService
  ) { }
  
  ngOnInit(): void {
  this.registrationForm = this.fb.group({
  email: ['', [Validators.required, Validators.email]],
  password: ['', Validators.required],
  username: ['', Validators.required],
  mobileNumber: ['', [Validators.required, Validators.pattern('^((\\+91-?)|0)?[0-9]{10}$')]],
  userRole: ['', Validators.required],
  confirmPassword: ['',Validators.required]
  });
  }
  
  onSubmit(): void {
  const user = {
  email: this.registrationForm.get('email')?.value,
  password: this.registrationForm.get('password')?.value,
  username: this.registrationForm.get('username')?.value,
  mobileNumber: this.registrationForm.get('mobileNumber')?.value,
  userRole: this.registrationForm.get('userRole')?.value
  };
  const checkpassword = {
    confirmPassword: this.registrationForm.get('confirmPassword')?.value
  }

  if(user.password===checkpassword.confirmPassword){
  this.userService.registerUser(user)
  .subscribe(
  response => {
  console.log(response);
  if(response!=null){
  alert("New user added");
  }
  else{
    this.errormessage=this.message1;
    // console.log(console.error(this.errormessage));
    throw new PasswordError(this.errormessage)
  }
  },
  error => {
  console.log(error);
  }
  );
  }
  else{
    this.errormessage=this.message;
    // console.log(console.error(this.errormessage));
    throw new PasswordError(this.errormessage)
  }
  }
}