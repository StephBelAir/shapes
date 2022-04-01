import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShapeListDetailComponent } from './shape-list-detail.component';

describe('ShapeListDetailComponent', () => {
  let component: ShapeListDetailComponent;
  let fixture: ComponentFixture<ShapeListDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShapeListDetailComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShapeListDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
