import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


import {IShape} from "../models/iShape";
import {IShapeList} from "../models/iShapeList";

@Injectable({  providedIn: 'root'})
export class ShapeService {


  private shapesUrl = 'http://localhost:9090/Forms';  // URL to web api

  httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  };


  constructor(
    private http: HttpClient) { }

  /** GET shapes from the server */
  getShapes(): Observable<IShape[]> {
    return this.http.get<IShape[]>(this.shapesUrl);
  }

  getShape(id: number): Observable<IShape> {
    return this.http.get<IShape>(this.shapesUrl + "/" + id);
  }

  /** GET shapeList from the server */

  getList(): Observable<IShapeList[]>{
    return this.http.get<IShapeList[]>(this.shapesUrl + "/List/");
  }

}

