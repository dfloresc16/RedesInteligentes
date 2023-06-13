import { NgModule } from '@angular/core';
import { RouterModule,Routes } from "@angular/router";
import { LoginComponent } from './msc/pages/login/login-page.component';
import { HomePageComponent } from './msc/pages/home-page/home-page.component';
import { ServicesPageComponent } from './msc/pages/services-page/services-page.component';
import { VlrComponent } from './msc/pages/vlr/vlr.component';
const routes: Routes = [
  {path : 'login', component:LoginComponent},
  {path : 'hlr', component:HomePageComponent},
  {path : 'services', component:ServicesPageComponent},
  {path : 'auc',component:LoginComponent},
  {path : 'vlr', component:VlrComponent},
  {path : '**', redirectTo:'login'},
]

@NgModule({
  imports:[RouterModule.forRoot(routes,{onSameUrlNavigation:'reload'})],
  exports:[RouterModule]
})
export class AppRoutingModule{}
