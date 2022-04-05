import {Component, Input, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {Location} from "@angular/common";
import {ShapeService} from "../services/shape.service";

import {IShapeList} from "../models/iShapeList";


@Component({
  selector: 'app-dashboard-detail',
  templateUrl: './dashboard-detail.component.html',
  styleUrls: ['./dashboard-detail.component.css']
})
export class DashboardDetailComponent implements OnInit {
  @Input() shapeList?: IShapeList;

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
    }

  goBack(): void {
    this.location.back();
  }
}
