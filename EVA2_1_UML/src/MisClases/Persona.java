/*

 */
package MisClases;


public class Persona {
 private int id;
 private String nombre;
 private int edad;

 //----------------------------------------------------------------------------- 
 public int getID(){
    return id; 
 }
 public void setID(int Id){
    id = Id; 
 }
 //-----------------------------------------------------------------------------
 public String getNom(){
  return nombre;   
 }
 public void setNom(String nom){
   nombre = nom;  
 }
  //-----------------------------------------------------------------------------
 public int getEdad(){
  return edad;   
 }
 public void setEdad(int Age){
   edad = Age;  
 }
  //-----------------------------------------------------------------------------
 public void imprimirData(){
     System.out.println("Datos de la persona.\n");
     System.out.println("ID: "+id);
     System.out.println("Nombre: "+nombre);
     System.out.println("Edad: "+edad);
     System.out.println("\n-----------------------------------------------------");
 }
 
 
 
 
 
 
}
