import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { HlrService } from '../../services/hlr.service';
import { UsuarioHlrDTO } from '../../interfaces/msc.interfaces';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login-page.component.html'
})
export class LoginComponent implements OnInit {

  nombreTxt: string = '';
  numTxt: string = '';
  usuarioHlrDTO: UsuarioHlrDTO | undefined;


  constructor(private hlrService: HlrService, private router: Router) { }

  ngOnInit(): void {
  }

  getDataHLRImplementation(nombre: string, num: string) {
    this.nombreTxt = nombre;
    this.numTxt = num;
    this.hlrService.getDataHlr(this.nombreTxt, this.numTxt).subscribe(dato => {
      this.usuarioHlrDTO = dato;
      const selectElement = document.getElementById('Radiobase') as HTMLSelectElement; // Obtener el elemento <select>
      const selectedValue = selectElement.value; // Obtener el valor seleccionado


      if (dato.body.idUsuario != nombre || dato.body.numAbonado != num) {
        localStorage.clear();
        Swal.fire({ icon: 'error', title: 'Advertencia', text: `Algun dato es incorrecto tienes ${Number(3) - dato.body.estadoVlr} intentos` });
        if (this.usuarioHlrDTO.body.estadoVlr == 3) {
          this.router.navigate(['vlr'])
        }
      } else {
        if (selectedValue == String(20)) {
          console.log("Entre a vlr")
          this.router.navigate(['vlr'])
          localStorage.clear();
          localStorage.setItem('idEquipo', String(dato.body.idEquipo));
          localStorage.setItem('idUsuario', dato.body.idUsuario);
          localStorage.setItem('imei', dato.body.imei);
          localStorage.setItem('mnc', String(dato.body.mnc));
          localStorage.setItem('numAbonado', dato.body.numAbonado);
          localStorage.setItem('tipoPlan', String(dato.body.tipoPlan));
        }

        if (selectedValue == String(90)) {
          console.log("Entre a hlr")
          this.router.navigate(['hlr'])
          localStorage.clear();
          localStorage.setItem('idEquipo', String(dato.body.idEquipo));
          localStorage.setItem('idUsuario', dato.body.idUsuario);
          localStorage.setItem('imei', dato.body.imei);
          localStorage.setItem('mnc', String(dato.body.mnc));
          localStorage.setItem('numAbonado', dato.body.numAbonado);
          localStorage.setItem('tipoPlan', String(dato.body.tipoPlan));
        }


      }
    })
  }
}
