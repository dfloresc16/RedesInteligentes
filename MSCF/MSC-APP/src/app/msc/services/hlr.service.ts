import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { UsuarioHlrDTO } from '../interfaces/msc.interfaces';

@Injectable({providedIn: 'root'})
export class HlrService {

  constructor(private httpClient: HttpClient,private router:Router) { }

  private baseURL = "http://localhost:8080/MSC/HLR/";

  getDataHlr(nombre:String):Observable<UsuarioHlrDTO>{
    return this.httpClient.get<UsuarioHlrDTO>(`${this.baseURL}${nombre}`);
  }
}
