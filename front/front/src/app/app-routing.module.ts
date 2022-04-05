import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShapeListComponent} from "./shapeList/shapeList.component";
import { ShapesComponent} from "./shapes/shapes.component";
import { ShapeDetailComponent } from "./shape-detail/shape-detail.component";
import { ShapeListDetailComponent} from "./shape-list-detail/shape-list-detail.component";

const routes: Routes = [
  { path: '', redirectTo: '/shapeList', pathMatch: 'full' },
  { path: 'shapeList', component: ShapeListComponent},
  { path: 'shapeListDetails', component: ShapeListDetailComponent},
  { path: 'shapeList/:id', component: ShapeListComponent},
  { path: 'detail/:id', component: ShapeDetailComponent }, //sheetID
  { path: 'shapes', component: ShapesComponent },
  { path: 'detailList/:sheetId', component: ShapeDetailComponent }, //sheetID


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

