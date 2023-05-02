import { TestBed } from '@angular/core/testing';

import { CricketdataService } from './cricketdata.service';

describe('CricketdataService', () => {
  let service: CricketdataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CricketdataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
