import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import { IShapeList } from "../models/iShapeList";
import {ShapeService} from "../services/shape.service";

@Component({
  selector: 'app-dashboard-form',
  templateUrl: './dashboard-form.component.html',
  styleUrls: ['./dashboard-form.component.css']
})
export class DashboardFormComponent implements OnInit {

  formGroup: FormGroup = this.formbuilder.group({
    type:[],
  })

  types = ['circle', 'triangle', 'rectangle'];



  submitted = false;

  onSubmit() { this.submitted = true; }




  constructor(
    private formbuilder: FormBuilder,
    private shapeService: ShapeService
  ) { }

  ngOnInit(): void {
  }
  addShapesInList(sheetId: any, type: any, width: any, length: any){
    this.shapeService.addShapeInList(sheetId,{type, width, length}as any).subscribe();
  }
}
