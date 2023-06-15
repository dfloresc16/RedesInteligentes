import { Component } from '@angular/core';
import { UsuarioHlrDTO } from '../../interfaces/msc.interfaces';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
})
export class HomePageComponent {

  public idEquipo = localStorage.getItem('idEquipo');
  public idUsuario = localStorage.getItem('idUsuario');
  public imei = localStorage.getItem("imei");
  public mnc = localStorage.getItem("mnc");
  public numAbonado = localStorage.getItem("numAbonado");
  public tipoPlan = localStorage.getItem("tipoPlan");
  public valueList?: string;

  getAuthentication(){
    const selectElement = document.getElementById('estado') as HTMLSelectElement;
    this.valueList = selectElement.value;
    console.log(this.valueList)
  }








}
