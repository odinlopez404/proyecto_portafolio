import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Experiencia } from '../modelos/experiencia';
import { ExperienciaService } from '../servicios/experiencia.service';
import {faEdit, faTrash} from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  Edit=faEdit;
  Delete=faTrash;

  constructor(private experienciaService:ExperienciaService) {}
    public experiencias:Experiencia[]=[];
   

    ngOnInit(): void {
      this.getExperiencias();
    }

    public getExperiencias():void{
      this.experienciaService.getExperiencia().subscribe(
        {next:(Response:Experiencia[])=>{
          this.experiencias=Response;
        },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
      }
      )
        }
      }