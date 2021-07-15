
package mipaquete;

public class fracciones {
    public static void main(String[] args) {
        double numero1 = 20;
                double numero2 = 15;
                double suma, resta, multiplicacion = 0;
                double divicion = 0;
                
                suma = numero2 + numero1;
                multiplicacion = numero1 * numero2;
                resta = numero1 - numero2;
                
                if (numero2 !=0)
                {
                    divicion = numero2 / numero1;
                }
                
                System.out.println("total de la resta \n" + resta);
                  System.out.println("total de la multiplicacion\n" + multiplicacion);
                    System.out.println("total de la suma\n" + suma);
                      System.out.println("total de la divicion\n" + divicion );
    }
    
}
