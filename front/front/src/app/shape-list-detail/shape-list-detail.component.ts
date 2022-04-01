import {Component, Input, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import { Location } from "@angular/common";
import {ShapeService} from "../services/shape.service";

import {IShapeList} from "../models/iShapeList";
//import {IShape} from "../models/iShape";

@Component({
  selector: 'app-shape-list-detail',
  templateUrl: './shape-list-detail.component.html',
  styleUrls: ['./shape-list-detail.component.css']
})
export class ShapeListDetailComponent implements OnInit {
  @Input() shapeList?: IShapeList[];
//  @Input() shape?: IShape;



  constructor(
    private route: ActivatedRoute,
    private shapeService: ShapeService,
    private location: Location
  ) { }

  ngOnInit(): void {
    this.getList();
  }

  getList(): void{
    const sheetId = Number(this.route.snapshot.paramMap.get('sheetId'));
    this.shapeService.getList(sheetId)
      .subscribe(shapeList => this.shapeList = shapeList);

    //.subscribe(shapeList => this.shapeList = shapeList);
  }

  goBack(): void {
    this.location.back();
  }

}
