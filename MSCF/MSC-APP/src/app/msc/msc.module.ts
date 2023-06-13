import { ServicesPageComponent } from './pages/services-page/services-page.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { LoginComponent } from './pages/login/login-page.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './pages/navbar/navbar.component';
import { VlrComponent } from './pages/vlr/vlr.component';


@NgModule({
  declarations: [
    HomePageComponent,
    LoginComponent,
    ServicesPageComponent,
    NavbarComponent,
    VlrComponent,
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    FormsModule
  ],
  exports:[
    LoginComponent,
    ServicesPageComponent,
    HomePageComponent,
    VlrComponent
  ]
})
export class MscModule { }
