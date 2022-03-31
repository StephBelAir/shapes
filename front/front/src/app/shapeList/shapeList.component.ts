import { Component, OnInit } from '@angular/core';
import {ShapeService} from "../services/shape.service";

@Component({
  selector: 'app-shapeList',
  templateUrl: './shapeList.component.html',
  styleUrls: ['./shapeList.component.css']
})
export class ShapeListComponent implements OnInit {
  drawing: any;


  constructor(private shapeService: ShapeService) {
  }

  ngOnInit(): void {
    this.getList();
  }

  getList(): void {    // any ?
    this.shapeService.getList()
      .subscribe((shapeList) => {
        this.drawing = shapeList;
      });
  }

}
