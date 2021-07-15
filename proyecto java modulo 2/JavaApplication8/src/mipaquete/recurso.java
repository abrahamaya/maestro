
//jose abrahan ayala
// tarea modulo numero 2

package mipaquete;

public class recurso {
    String programacion;
    double edad;
    int multiplicacion;
    int listado;
  public static void main(String arg[ ]) {
      
   
recurso recurso = new recurso(); 
recurso.programacion();  
recurso.edad(21); 
recurso.multiplicacion(3, 10);
  recurso.listado(50);     
    }
   
    
  
  public void sere() {
    System.out.println("PROGRAMACION ORIENTADA AOBJETOS 2021");
}
   
  
public void edad(double edad) {
  if (edad > 21){
     System.out.println("Eres mayor de edad");
  }else{
     System.out.println("Eres menor de edad");
     }
    }
 public void multiplicacion(int n1, int n2){
    multiplicacion= n1 * n2;
   System.out.println("resultado de la multiplicacion\n"+multiplicacion);
   
}
public void listado (int n1){
     for(listado=1; listado<= n1; listado++){
        if((listado % 1) == 0){
            System.out.println("listado de numeros  " + listado);
             
}
   }
}   
}   
