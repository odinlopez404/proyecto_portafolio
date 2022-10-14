import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Educacion } from 'src/app/modelos/educacion';
import { EducacionService } from 'src/app/servicios/educacion.service';
import {faEdit, faTrash} from '@fortawesome/free-solid-svg-icons';



@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
  Edit = faEdit;
  Delete = faTrash


  constructor(private educacionService:EducacionService) { }
  public educaciones:Educacion[]=[];
  
  ngOnInit(): void {
    this.getEducaciones();
  }

  public getEducaciones():void{
this.educacionService.getEducacion().subscribe(
  {next:(Response:Educacion[])=>{
    this.educaciones=Response;
  },
error:(error:HttpErrorResponse)=>{
  alert(error.message);
}
}
)
  }
}
