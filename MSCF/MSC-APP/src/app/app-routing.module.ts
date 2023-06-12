import { NavbarComponent } from './msc/pages/navbar/navbar.component';
import { NgModule } from '@angular/core';
import { RouterModule,Routes } from "@angular/router";
import { LoginComponent } from './msc/pages/login/login-page.component';
import { HomePageComponent } from './msc/pages/home-page/home-page.component';
const routes: Routes = [
  {path : 'login', component:LoginComponent},
  {path : 'hlr', component:HomePageComponent},
  {path : '**', redirectTo:'login'}
]

@NgModule({
  imports:[RouterModule.forRoot(routes,{onSameUrlNavigation:'reload'})],
  exports:[RouterModule]
})
export class AppRoutingModule{}
