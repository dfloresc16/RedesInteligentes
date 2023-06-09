import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { HlrService } from '../../services/hlr.service';
import { UsuarioHlrDTO } from '../../interfaces/msc.interfaces';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login-page.component.html'
})
export class LoginComponent implements OnInit{

  nombreTxt:string='';

  usuarioHlrDTO:UsuarioHlrDTO | undefined;


  constructor(private hlrService:HlrService,private router:Router){}

  ngOnInit(): void {
  }

  getDataHLRImplementation(nombre:string){
    this.nombreTxt = nombre;
    console.log(this.nombreTxt);
    this.hlrService.getDataHlr(this.nombreTxt).subscribe(dato =>{
      this.usuarioHlrDTO = dato;
      console.log(dato)

      if(dato.idUsuario != nombre){
        Swal.fire({icon:'error',title:'Advertencia',text:'Algun dato es incorrecto'});
      }else{
        localStorage.clear();
        localStorage.setItem('idEquipo',String(dato.idEquipo));
        localStorage.setItem('idUsuario',dato.idUsuario);
        localStorage.setItem('imei',dato.imei);
        localStorage.setItem('mnc',String(dato.mnc));
        localStorage.setItem('numAbonado',dato.numAbonado);
        localStorage.setItem('tipoPlan',String(dato.tipoPlan));
        this.router.navigate(['hlr'])
      }
    })
  }
}
