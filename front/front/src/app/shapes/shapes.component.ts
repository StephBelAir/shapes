import { Component, OnInit } from '@angular/core';
import { Shape } from "../Shape";
import {ShapeService} from "../services/shape.service";

@Component({
  selector: 'app-shapes',
  templateUrl: './shapes.component.html',
  styleUrls: ['./shapes.component.css']
})
export class ShapesComponent implements OnInit {

  selectedShape?: Shape;

  shapes: Shape[] = [];


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
