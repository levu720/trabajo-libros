
package com.mycompany.libros;

public abstract class Libro {
    
    protected String titulo;
    protected String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    abstract double calcularprecio();
    
    
    
}
