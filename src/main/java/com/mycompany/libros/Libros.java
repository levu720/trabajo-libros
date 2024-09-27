
package com.mycompany.libros;

public class Libros {

    public static void main(String[] args) {
        
        Libro n1 [] = new Libro [3] ;
        
        n1[0]= new LibroTexto("ondas","juan",4000,3);
        n1[1]= new LibroUdec("programacion","camilo","ingenieria",7000);
        n1[2]= new Novela("poemas cortos","luis","romantico",5000); 
        
        for (Libro n2 : n1){
            
            System.out.println(n2.calcularprecio());
        }
        
    }
}

