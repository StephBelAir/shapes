import {IShape } from "./iShape";

export interface IShapeList {
  sheetId: number;
  shapes: IShape[];
  totalSurface: number;
  totalPerimetre: number;

}
