import {IShape } from "./iShape";

export interface IShapeList {
  id: number;
//  name : string;
  shapes: IShape[];
  totalArea: number;
  totalPerimeter: number;
}
