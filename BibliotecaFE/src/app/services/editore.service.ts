import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';0
import { Libro } from '../models/libro';
import { Observable } from 'rxjs';

const urlEditoreEndPoint = '/biblioteca/editore';

@Injectable({
  providedIn: 'root'
})
export class EditoreService {

  constructor(private http: HttpCliente) { }

  getAllEditore(): Observable<Editore[]>{
    return this.get<Editore[](urlEditoreEndPoint+'/get-all')
  }
}
