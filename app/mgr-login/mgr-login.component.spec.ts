import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MgrLoginComponent } from './mgr-login.component';

describe('MgrLoginComponent', () => {
  let component: MgrLoginComponent;
  let fixture: ComponentFixture<MgrLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MgrLoginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MgrLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
