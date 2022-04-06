import {IShape } from "./iShape";

export interface IShapeList {
  sheetId: any;
  shapes: IShape[];
  totalSurface: number;
  totalPerimetre: number;

}
