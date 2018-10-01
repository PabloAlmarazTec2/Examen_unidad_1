/*
este programa sirve para trasnformar los grados celsius farenheit y kelvin
usamos sus respetivas formulas para calcular la transformacion de la temperatura
 */
package grados1;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Grados1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner np = new Scanner(System.in);
        float grados;
        System.out.println("favor de ingresar los grados");
        grados = np.nextFloat();
        Conversion solucion = new Conversion(grados);
           
        solucion.convertir();
         solucion.convertir2();
         solucion.convertir3();
        solucion.mostrarResultado();
       
    
    }
}
  class Conversion{
  float f, c,k;
  Conversion(float grados)
  {
  c = grados; 
      f = grados;
   
  k = grados;
  }
  public void convertir()
  {
        f = (c*9/5)+32;
  
  
 
  }
  public void convertir2()
  {
  
   c = (f-32)*5/9;
  }
  public void convertir3()
  {
   k = (c+273);
  } 
  
  public void mostrarResultado()
{ 
    System.out.println("transformas grados c a f formula es f = (c*9/5)+32;; ");
        System.out.println(c+" F equivale a "+f+" c");
    System.out.println("transformas grados f a c formula es c = (f-32)*5/9; ");
    System.out.println(f+" F equivale a "+c+" c");
      
        System.out.println("transformas grados k a c formula es f = (c+273);; ");
     System.out.println(c+" F equivale a "+k+" c");
}

  }

  

