import { Component, OnInit } from '@angular/core';
import {faUser} from '@fortawesome/free-solid-svg-icons';
import {faInstagram,faLinkedin} from '@fortawesome/free-brands-svg-icons';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { Usuario } from '../modelos/usuario';
import { UsuarioService } from '../servicios/usuario.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  login = faUser;
  instagram = faInstagram;
  linkedin = faLinkedin

  
  public usuario:Usuario | undefined;
  public editarUsuario: Usuario | undefined;
  constructor(private usuarioService:UsuarioService) { }

  
  ngOnInit(): void {
    this.getUsuario();
  }

  public getUsuario():void{
this.usuarioService.getUsuario().subscribe(
  {next:(Response:Usuario)=>{
    this.usuario=Response;
  },
error:(error:HttpErrorResponse)=>{
  alert(error.message);
}
}
)
  }
}

