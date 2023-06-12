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
  numTxt:string = '';
  usuarioHlrDTO:UsuarioHlrDTO | undefined;


  constructor(private hlrService:HlrService,private router:Router){}

  ngOnInit(): void {
  }

  getDataHLRImplementation(nombre:string,num:string){
    this.nombreTxt = nombre;
    this.numTxt = num;
    console.log(this.nombreTxt);
    this.hlrService.getDataHlr(this.nombreTxt,this.numTxt).subscribe(dato =>{
      this.usuarioHlrDTO = dato;
      console.log(num)
      console.log(nombre)
      console.log(dato)

      if(dato.body.idUsuario != nombre || dato.body.numAbonado != num){
        localStorage.clear();
        Swal.fire({icon:'error',title:'Advertencia',text:`Algun dato es incorrecto tienes ${Number(3)-dato.body.estadoVlr} intentos`});
        if(this.usuarioHlrDTO.body.estadoVlr == 3){
          this.router.navigate(['hlr'])
        }
      }else{
        localStorage.clear();
        localStorage.setItem('idEquipo',String(dato.body.idEquipo));
        localStorage.setItem('idUsuario',dato.body.idUsuario);
        localStorage.setItem('imei',dato.body.imei);
        localStorage.setItem('mnc',String(dato.body.mnc));
        localStorage.setItem('numAbonado',dato.body.numAbonado);
        localStorage.setItem('tipoPlan',String(dato.body.tipoPlan));
        this.router.navigate(['hlr'])
      }
    })
  }
}
