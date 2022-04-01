import {IShape } from "./iShape";

export interface IShapeList {
  sheetId: number;
//  name : string;
  shapes: IShape[];
  totalArea: number;
  totalPerimeter: number;
}
