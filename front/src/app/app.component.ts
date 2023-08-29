import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private http: HttpClient) {
  }

  title = 'front';
  responseFromServer = 'xyz'

  ngOnInit(): void {
    this.http.get('/api/time', {responseType: 'text'}).subscribe(data => {
      this.responseFromServer = data as string;
    })
  }
}
