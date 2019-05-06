import { TestBed } from '@angular/core/testing';

import { RecipService } from './recip.service';

describe('RecipService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RecipService = TestBed.get(RecipService);
    expect(service).toBeTruthy();
  });
});
