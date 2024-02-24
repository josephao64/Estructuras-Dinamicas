import lombok.Builder;
import lombok.Data;
@Data
public class Libro {


    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroPag;

    public Libro(int ISBN, String titulo, String autor, int numeroPag) {
        this.ISBN = ISBN;
        Titulo = titulo;
        Autor = autor;
        NumeroPag = numeroPag;
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumeroPag() {
        return NumeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        NumeroPag = numeroPag;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", NumeroPag=" + NumeroPag +
                '}';
    }
}




