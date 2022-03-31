import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';



import {Shape} from "../Shape";
// import {ShapeList} from "../ShapeList";

@Injectable({  providedIn: 'root'})
export class ShapeService {


  private shapesUrl = 'http://localhost:9090/Forms';  // URL to web api

  httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  };


  constructor(
    private http: HttpClient) { }

  /** GET shapes from the server */
  getShapes(): Observable<Shape[]> {
    return this.http.get<Shape[]>(this.shapesUrl);
  }

  getShape(id: number): Observable<Shape> {
    return this.http.get<Shape>(this.shapesUrl + "/" + id);
  }

}

