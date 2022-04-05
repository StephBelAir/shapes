import {Component, Input, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import { Location } from "@angular/common";
import {ShapeService} from "../services/shape.service";


@Component({
  selector: 'app-shape-list-detail',
  templateUrl: './shape-list-detail.component.html',
  styleUrls: ['./shape-list-detail.component.css']
})
export class ShapeListDetailComponent implements OnInit {
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
