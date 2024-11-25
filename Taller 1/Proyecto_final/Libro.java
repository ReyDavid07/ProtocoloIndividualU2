package Proyecto_final;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        this("Título", "Autor", 0);
    }

    public Libro(String titulo, String autor) {
        this(titulo, autor, 0);
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro:" +
                "titulo: " + titulo +
                ", autor:" + autor +
                ", numeroPaginas:" + numeroPaginas 
                ;
    }
}

