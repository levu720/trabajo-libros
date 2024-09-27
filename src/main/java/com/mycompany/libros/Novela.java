
package com.mycompany.libros;

public class Novela extends Libro{
    
    String tipo;
    int precio;
    
    public Novela(String titulo, String autor, String tipo, int precio){
    super (titulo, autor);
    
    this.tipo=tipo;
    this.precio=precio;        
    }
    
     @Override
   double calcularprecio(){
       
       double calcularprecio= precio - (precio*0.15);
   
       return calcularprecio;
   
   }
   
    
}
