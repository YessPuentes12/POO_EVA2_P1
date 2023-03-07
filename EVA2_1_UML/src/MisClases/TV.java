/*

 */
package MisClases;


public class TV {
 int canal; 
 int volumen;
 boolean poder;

 //-----------------------------------------------------------------------------
public int getCanal(){
  return canal;
}
public void setCanal(int channel){
 canal = channel;   
}    
 //-----------------------------------------------------------------------------
 public int getVolumen(){
 return volumen;    
 }  
 public void setVolumen(int volume){   
  volumen = volume;  
 }  
  //-----------------------------------------------------------------------------
 public boolean getPoder(){
  return poder;   
 }  
 public void setPoder (boolean power){
  poder = power;  
 }  
  //-----------------------------------------------------------------------------
 public void tvData(){
   if (poder==true){
      System.out.println("Tv encendida.");
        System.out.println("Canal número: "+canal);
      System.out.println("Volumen en: "+volumen);
  } else if (poder=false){
      System.out.println("....");   
  }
   //-----------------------------------------------------------------------------  
 }
 public void line (){
  System.out.println("\n-----------------------------------------------------");   
 }
    
    
  
 
 
 
 
    }
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

