import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute} from "@angular/router";
import { Location } from "@angular/common";
import { ShapeService} from "../services/shape.service";

import { IShape } from "../models/iShape";

@Component({
  selector: 'app-shape-detail',
  templateUrl: './shape-detail.component.html',
  styleUrls: ['./shape-detail.component.css']
})
export class ShapeDetailComponent implements OnInit {
  @Input() shape?: IShape;


  constructor(
    private route: ActivatedRoute,
    private shapeService: ShapeService,
    private location: Location
  ) { }

  ngOnInit(): void {
    this.getShape();
  }

  getShape(): void{
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.shapeService.getShape(id)
      .subscribe(shape => this.shape = shape);
  }

  goBack(): void {
    this.location.back();
  }
}
