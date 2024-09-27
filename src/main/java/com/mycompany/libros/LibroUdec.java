
package com.mycompany.libros;

public class LibroUdec extends Libro {
    
   String facultad;
   int precio;
   
   public LibroUdec (String titulo, String autor, String facultad, int precio){
   super(titulo,autor);
   this.facultad=facultad;
   this.precio=precio;
   
   }
   
   @Override
   double calcularprecio(){
       
       double calcularprecio= precio - (precio*0.25);
   
       return calcularprecio;
   
   }
   
   }
    

