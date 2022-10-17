import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { faEdit, faTrash } from '@fortawesome/free-solid-svg-icons';
import { Usuario } from '../modelos/usuario';
import { UsuarioService } from '../servicios/usuario.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  Edit = faEdit;
  Delete = faTrash;
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
