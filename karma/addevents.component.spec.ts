import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AddEventsComponent } from './addevents.component';

describe('AddEventsComponent', () => {
  let component: AddEventsComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [AddEventsComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(AddEventsComponent);
    component = fixture.componentInstance;
  });
  it('FE_addEventsTest', () => {
    expect(component).toBeTruthy();
  });
});