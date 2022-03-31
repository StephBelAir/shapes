import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShapeListComponent} from "./shapeList/shapeList.component";
import { ShapesComponent} from "./shapes/shapes.component";
import { ShapeDetailComponent } from "./shape-detail/shape-detail.component";

const routes: Routes = [
  { path: '', redirectTo: '/shapeList', pathMatch: 'full' },
  { path: 'shapeList', component: ShapeListComponent},
  { path: 'shapeList/:id', component: ShapeListComponent},
  { path: 'detail/:id', component: ShapeDetailComponent },
  { path: 'shapes', component: ShapesComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

