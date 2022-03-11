import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EngrShowComponent } from './engr-show.component';

describe('EngrShowComponent', () => {
  let component: EngrShowComponent;
  let fixture: ComponentFixture<EngrShowComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EngrShowComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EngrShowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
