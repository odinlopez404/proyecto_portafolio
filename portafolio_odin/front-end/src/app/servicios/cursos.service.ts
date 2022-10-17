import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Cursos } from '../modelos/cursos';

@Injectable({
  providedIn: 'root'
})
export class CursosService {
  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http:HttpClient) { }

  public getCursos():Observable<Cursos[]>{
    return this.http.get<Cursos[]>(`${this.apiServerUrl}/cursos/all`);
   }
   public addCursos(cursos:Cursos):Observable<Cursos>{
    return this.http.post<Cursos>(`${this.apiServerUrl}/cursos/add`,cursos); 
   }
   public updateCursos(cursos:Cursos):Observable<Cursos>{
    return this.http.put<Cursos>(`${this.apiServerUrl}/cursos/update`,cursos); 
   }
   public deleteCursos(idCursos:number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/cursos/delete/${idCursos}`); 
   }
}
