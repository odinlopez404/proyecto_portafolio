import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Proyectos } from '../modelos/proyectos';
import { ProyectosService } from '../servicios/proyectos.service';
import {faEdit, faTrash} from '@fortawesome/free-solid-svg-icons';


@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent implements OnInit {

  Edit = faEdit;
  Delete = faTrash

  constructor(private proyectosService:ProyectosService) {}
    public proyectos:Proyectos[]=[];
   

    ngOnInit(): void {
      this.getProyectos();
    }

    public getProyectos():void{
      this.proyectosService.getProyectos().subscribe(
        {next:(Response:Proyectos[])=>{
          this.proyectos=Response;
        },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
      }
      )
        }
      }