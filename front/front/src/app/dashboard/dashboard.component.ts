import {Component, Input, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import { Location } from "@angular/common";
import {ShapeService} from "../services/shape.service";
import {IShape} from "../models/iShape";
import {IShapeList} from "../models/iShapeList";


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  selectedShapeList?: IShapeList;


  drawing: any;


  constructor(
    private route: ActivatedRoute,
    private shapeService: ShapeService,
    private location: Location
  ) { }

  ngOnInit(): void {
    this.getLists();
  }

  getLists(): void {    // any ?
    this.shapeService.getLists()
      .subscribe((shapeList) => {
        this.drawing = shapeList;
      });
  }

  addNewList(){
    this.shapeService.addList().subscribe();
  }

  deleteList(sheetId: any){
    this.shapeService.deleteList(sheetId).subscribe();
  }

  deleteAllList(){
    this.shapeService.deleteAllList().subscribe();
  }





}
