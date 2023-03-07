/*

 */
package MisClases;


public class Vehículo {
String marca;
String modelo;
int año;

  //-----------------------------------------------------------------------------
public String getMarca(){
  return marca;  
}
public void setMarca(String marc){
  marca = marc;  
}
  //-----------------------------------------------------------------------------
public String getModelo(){
  return modelo;  
}
public void setModelo(String model){
  modelo = model;  
}
  //-----------------------------------------------------------------------------
public int getAño(){
 return año;
}
public void setAño(int year){
 año = year;   
}
  //-----------------------------------------------------------------------------
public void printData(){
    System.out.println("Datos del vehículo.\n");
    System.out.println("Marca: "+marca);
    System.out.println("Modelo: "+modelo);
    System.out.println("Año: "+año);
    System.out.println("\n-----------------------------------------------------");
}








}
