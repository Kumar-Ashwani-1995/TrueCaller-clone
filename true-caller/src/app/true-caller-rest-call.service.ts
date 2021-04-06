import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TrueCallerRestCallService {

  constructor(private http: HttpClient) { }

  public search(phoneNumber){
    return this.http.get("http://localhost:8081/search/"+phoneNumber);
  }
}
