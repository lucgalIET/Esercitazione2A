export class Libro {
    idLibro: number;
    titolo: string;
    genere: string;

    constructor(idLibro: number,
        titolo: string,
        genere: string){
            this.idLibro = idLibro
            this.titolo= titolo
            this.genere= genere
        }
}