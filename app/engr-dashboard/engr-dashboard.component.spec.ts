import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EngrDashboardComponent } from './engr-dashboard.component';

describe('EngrDashboardComponent', () => {
  let component: EngrDashboardComponent;
  let fixture: ComponentFixture<EngrDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EngrDashboardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EngrDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
