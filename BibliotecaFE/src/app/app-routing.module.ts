import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LibroComponent } from './components/libro/libro.component';
import { EditoreComponent } from './components/editore/editore.component';

const routes: Routes = [
  {path:'libro', component: LibroComponent},
  {path:'editore', component: EditoreComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
