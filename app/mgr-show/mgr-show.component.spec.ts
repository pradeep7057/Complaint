import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MgrShowComponent } from './mgr-show.component';

describe('MgrShowComponent', () => {
  let component: MgrShowComponent;
  let fixture: ComponentFixture<MgrShowComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MgrShowComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MgrShowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
