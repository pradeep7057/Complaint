import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EngrLoginComponent } from './engr-login.component';

describe('EngrLoginComponent', () => {
  let component: EngrLoginComponent;
  let fixture: ComponentFixture<EngrLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EngrLoginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EngrLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
