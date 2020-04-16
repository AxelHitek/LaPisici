import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'la-pisici';

  constructor(private http: HttpClient) { }
  ngOnInit(): void {
    this.getCats().subscribe(cat => {
      console.log(cat);
      console.log('that was it');
    });
  }

  getCats(): Observable<Object> {
    return this.http.get<Object>('/cat/get-cat', { params: { id: '1' } });
  }

}
