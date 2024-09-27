
package com.mycompany.libros;

public class LibroTexto extends Libro{
    
      
    private int precio;

    private int curso;
    
    public LibroTexto (String titulo, String autor, int precio, int curso){
          super(titulo, autor);
          this.curso= curso;
          this.precio=precio;
    }

  
    
    @Override
    
    double calcularprecio(){
        
    double calcularprecio = precio - (precio * 0.4);
    
    return calcularprecio;
    
    }
   
    
}
