import { Component, OnInit } from '@angular/core';
import { UsuarioHlrDTO } from '../../interfaces/msc.interfaces';
import { HlrService } from '../../services/hlr.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-vlr',
  templateUrl: './vlr.component.html',

})
export class VlrComponent implements OnInit {

  usuarioHlrDTO: UsuarioHlrDTO | undefined;

  constructor(private hlrService: HlrService, private router: Router) { }

  public idEquipo: String | null = localStorage.getItem('idEquipo');
  public idUsuario: String | null = localStorage.getItem('idUsuario');
  public imei: String | null = localStorage.getItem("imei");
  public mnc: String | null = localStorage.getItem("mnc");
  public numAbonado: String | null = localStorage.getItem("numAbonado");
  public tipoPlan: String | null = localStorage.getItem("tipoPlan");

  ngOnInit(): void {
    if (this.idUsuario !== null && this.numAbonado !== null) {
      this.hlrService.insertDataVlr(new String(this.idUsuario), new String(this.numAbonado)).subscribe(dato => {
        this.usuarioHlrDTO = dato;
        console.log(this.usuarioHlrDTO);

      });
    } else {
      // Manejar el caso en que los valores sean nulos
    }
  }



}
