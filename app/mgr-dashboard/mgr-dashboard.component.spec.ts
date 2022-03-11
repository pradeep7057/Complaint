import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MgrDashboardComponent } from './mgr-dashboard.component';

describe('MgrDashboardComponent', () => {
  let component: MgrDashboardComponent;
  let fixture: ComponentFixture<MgrDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MgrDashboardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MgrDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
