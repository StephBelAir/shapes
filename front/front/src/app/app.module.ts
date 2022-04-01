import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from "@angular/common/http";

import {FormsModule} from "@angular/forms";



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import { ShapesComponent } from './shapes/shapes.component';
import { ShapeDetailComponent } from './shape-detail/shape-detail.component';
import { ShapeListComponent } from './shapeList/shapeList.component';
import { ShapeListDetailComponent } from './shape-list-detail/shape-list-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    ShapesComponent,
    ShapeDetailComponent,
    ShapeListComponent,
    ShapeListDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
