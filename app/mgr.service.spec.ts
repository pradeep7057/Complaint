import { TestBed } from '@angular/core/testing';

import { MGRService } from './mgr.service';

describe('MGRService', () => {
  let service: MGRService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MGRService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
