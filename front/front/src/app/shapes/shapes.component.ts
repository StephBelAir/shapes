import { Component, OnInit } from '@angular/core';
import { IShape } from "../models/iShape";
import {ShapeService} from "../services/shape.service";

@Component({
  selector: 'app-shapes',
  templateUrl: './shapes.component.html',
  styleUrls: ['./shapes.component.css']
})
export class ShapesComponent implements OnInit {

  selectedShape?: IShape;

  shapes: IShape[] = [];


  constructor(private shapeService: ShapeService) { }

  ngOnInit(): void {
    this.getShapes()
  }

  getShapes(): void {
    this.shapeService.getShapes()
      .subscribe((shapes) => {
        this.shapes = shapes
      } );
  }
}
