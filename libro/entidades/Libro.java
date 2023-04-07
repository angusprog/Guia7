//*Creamos la clase libro

package libro.entidades;


public class Libro {

    public int isbm;
    public String titulo;
    public String autor;
    public int cantPag;

    public Libro(int isbm, String titulo, String autor, int cantPag) {
        this.isbm = isbm;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPag = cantPag;
    }

    public Libro() {
    }


    


    @Override
    public String toString() {
        return "Libro{" + "isbm=" + isbm + ", titulo=" + titulo + ", autor=" + autor + ", cantPag=" + cantPag + '}';
    }


    }



