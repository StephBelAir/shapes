import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from "@angular/common/http";

import {FormBuilder, FormsModule, ReactiveFormsModule} from "@angular/forms";



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import { ShapesComponent } from './shapes/shapes.component';
import { ShapeDetailComponent } from './shape-detail/shape-detail.component';
import { ShapeListComponent } from './shapeList/shapeList.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DashboardDetailComponent } from './dashboard-detail/dashboard-detail.component';
import { DashboardFormComponent } from './dashboard-form/dashboard-form.component';

@NgModule({
  declarations: [
    AppComponent,
    ShapesComponent,
    ShapeDetailComponent,
    ShapeListComponent,
    DashboardComponent,
    DashboardDetailComponent,
    DashboardFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
