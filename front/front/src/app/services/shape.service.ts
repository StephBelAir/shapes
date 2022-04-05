import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


import {IShape} from "../models/iShape";
import {IShapeList} from "../models/iShapeList";
import {ShapeListComponent} from "../shapeList/shapeList.component";
import {tap} from "rxjs/operators";

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

  getLists(): Observable<IShapeList[]>{
    return this.http.get<IShapeList[]>(this.shapesUrl + "/List/");
  }
  getList(sheetId: number): Observable<IShapeList[]>{
    return this.http.get<IShapeList[]>(this.shapesUrl + "/List/" + sheetId);
  }

  /** POST: add new List to the server */

    addList(): Observable<any>{
    return this.http.post<any>(this.shapesUrl+ "/List/addList", this.httpOptions);
  }

  /** DELETE List from the server */


  deleteList(sheetId: any): Observable<any>{
    return this.http.delete<any>(this.shapesUrl+ "/List"+"/"+ sheetId);
  }

  deleteAllList(): Observable<any>{
    return this.http.delete<any>(this.shapesUrl + "/List");
  }





}

