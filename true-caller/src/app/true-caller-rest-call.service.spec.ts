import { TestBed } from '@angular/core/testing';

import { TrueCallerRestCallService } from './true-caller-rest-call.service';

describe('TrueCallerRestCallService', () => {
  let service: TrueCallerRestCallService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TrueCallerRestCallService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
