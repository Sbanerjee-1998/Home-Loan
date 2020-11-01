import { Component, OnInit } from '@angular/core';
import { User} from "../User"
import {Router} from "@angular/router";
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user = new User("niloydasgupta0987@gmail.com","niloy@123");
  constructor(private router: Router) {}

  ngOnInit(): void {
  }
  btnClick(){
    this.router.navigate(['/registrationLink']);
}
}
