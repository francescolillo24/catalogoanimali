import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Animale } from './animale';
import { AnimaleDto } from './animale-dto';
import { ListaAnimaliDto } from './lista-animali-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private http: HttpClient) { }

  url = "http://localhost:8080/";

  animale = new Animale();
  animali: Animale[] = [];

  aggiungi() {
    let dto = new AnimaleDto();
    dto.animaleDto = this.animale;
    this.http.post<ListaAnimaliDto>(this.url + "aggiungi", dto)
      .subscribe(a => {
        this.animali = a.listaAnimali;
        this.animale = new Animale();
      });


  }

  elimina(l: Animale) {




  }
}

