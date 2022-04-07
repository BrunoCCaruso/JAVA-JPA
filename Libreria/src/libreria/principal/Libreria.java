package libreria.principal;

import libreria.servicios.LibreriaServicio;


public class Libreria {

    public static void main(String[] args) {
      
       try{ 
        LibreriaServicio servicio = new LibreriaServicio();
        servicio.menu(); 
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
        
        
    }
    
}
