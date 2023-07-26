import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';0

import { Libro } from '../models/libro';
import { Observable } from 'rxjs';

const urlLibroEndPoint = '/biblioteca/libro';

@Injectable({
  providedIn: 'root'
})
export class LibroService {
  constructor(private http: HttpClient) { }

  getAllLibri(): Observable<Libro[]> {
    return this.http.get<Libro[]>(urlLibroEndPoint+'/get-all')
  }

}
