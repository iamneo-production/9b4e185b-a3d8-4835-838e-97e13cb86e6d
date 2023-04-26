import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { ApplyFormComponent } from './applyform.component';

describe('ApplyFormComponent', () => {
  let component: ApplyFormComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [ApplyFormComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(ApplyFormComponent);
    component = fixture.componentInstance;
  });
  it('FE_applyFormTest', () => {
    expect(component).toBeTruthy();
  });
});