import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { BookEventComponent } from './bookevent.component';

describe('BookEventComponent', () => {
  let component: BookEventComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [BookEventComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(BookEventComponent);
    component = fixture.componentInstance;
  });
  it('FE_bookEventTest', () => {
    expect(component).toBeTruthy();
  });
});