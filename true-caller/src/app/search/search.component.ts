import { Component, OnInit } from '@angular/core';
import { TrueCallerRestCallService } from '../true-caller-rest-call.service';
import { User } from '../user';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
  user: any={};
  
  phoneNumber : String;
  constructor(private tcservice : TrueCallerRestCallService) { }

  ngOnInit(): void {
  }

  public getUserDetail(){
    this.tcservice.search(this.phoneNumber).subscribe(data => {this.user=data , console.log( this.user)},error =>console.log(error));
    
  }

}
