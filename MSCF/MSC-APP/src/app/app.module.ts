import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import {FormsModule} from '@angular/forms'

import { AppComponent } from './app.component';
import { MscModule } from './msc/msc.module';
import { AppRoutingModule } from './app-routing.module';
import { NavbarComponent } from './msc/pages/navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
  ],
  imports: [
    BrowserModule,
    CommonModule,
    MscModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
