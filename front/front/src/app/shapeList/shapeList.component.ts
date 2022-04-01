import { Component, OnInit } from '@angular/core';
import {ShapeService} from "../services/shape.service";
import {IShape} from "../models/iShape";
import {IShapeList} from "../models/iShapeList";

@Component({
  selector: 'app-shapeList',
  templateUrl: './shapeList.component.html',
  styleUrls: ['./shapeList.component.css']
})
export class ShapeListComponent implements OnInit {
  //  selectedShape?: IShape;
  selectedShapeList?: IShapeList;

  drawing: any;


  constructor(private shapeService: ShapeService) {
  }

  ngOnInit(): void {
    this.getLists();
  }

 public getLists() {    // any ?
    this.shapeService.getLists() //getList ??
      .subscribe((shapeList) => {
        console.log(shapeList)
        this.drawing = shapeList;
      });
  }

}
