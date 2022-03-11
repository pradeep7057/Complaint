import { TestBed } from '@angular/core/testing';

import { EngrService } from './engr.service';

describe('EngrService', () => {
  let service: EngrService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EngrService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
