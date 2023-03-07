/*

 */
package eva2_1_uml;

import MisClases.Persona;
import MisClases.TV;
import MisClases.Vehículo;


public class EVA2_1_UML {

  
    public static void main(String[] args) {
  
   // Clase persona
    Persona P1 = new Persona();
     P1.setID(1009);
     P1.setNom("Yessly");
     P1.setEdad(18);
     P1.imprimirData();
 //-----------------------------------------------------------------------------       
        
     // Clase vehículo
     Vehículo V1 = new Vehículo();
     V1.setMarca("Ford");
     V1.setModelo("Fiesta");
     V1.setAño(2020);
     V1.printData();
  //-----------------------------------------------------------------------------      
    
    // Clase TV
    TV tvmood = new TV();
    tvmood.setPoder(true); // <---------- Tv encendida
    tvmood.setCanal(45);
    tvmood.setVolumen(23);
    tvmood.tvData();
    tvmood.line();
    
    
   TV tvmood2 = new TV();     
   tvmood2.setPoder(false); // <----------- Tv apagada (no muestra datos)
   tvmood2.setCanal(77);
   tvmood.setVolumen(10);
   tvmood2.tvData();
   tvmood2.line();
        
        
        
        
        
    }
    
}
