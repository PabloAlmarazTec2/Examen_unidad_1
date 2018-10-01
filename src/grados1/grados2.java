/*
aqui declaramos los metodos y atributos
 */
package grados1;

import java.util.Scanner;

/**
 *
 * @author Pablo Aaron Almaraz Avalos 18550326
 */
public class grados2 {
 
  class Conversion2{
  double f, c;
  Conversion2(double grados)
  {
  f = grados;
 
  }
  public void convertir2()
  {
  c = (f-32)*5/9;

  }
   
  public void mostrarResultado2()
{
    System.out.println(""+c);
    
  
}
  }
}