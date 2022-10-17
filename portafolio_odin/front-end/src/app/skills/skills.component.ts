import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Skills } from '../modelos/skills';
import { SkillsService } from '../servicios/skills.service';
import {faEdit, faTrash} from '@fortawesome/free-solid-svg-icons';


@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  Edit = faEdit;
  Delete = faTrash

  constructor(private skillsService:SkillsService) {}
    public skills:Skills[]=[];
   

    ngOnInit(): void {
      this.getSkills();
    }

    public getSkills():void{
      this.skillsService.getSkills().subscribe(
        {next:(Response:Skills[])=>{
          this.skills=Response;
        },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
      }
      )
        }
      }