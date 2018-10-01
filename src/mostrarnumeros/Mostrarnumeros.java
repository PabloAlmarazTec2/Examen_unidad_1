/*
este programa es para transformar numeros a letras usamos una condicion if y arrays

 */
package mostrarnumeros;

import java.util.Scanner;

/**
 *
 * @author Pablo Aaron Almaraz Avalos 18550326
 */
public class Mostrarnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

                             
        Scanner sp = new Scanner(System.in);
        System.out.print("ingrese un numero menor a 100: "); 
        int num = sp.nextInt();
        
        convertir np = new convertir();
        if(num>=0 && num<11)
             System.out.print('\n' + np.getUnidades()[num]);       
        else if(num<20)
            System.out.print('\n' + np.getespeciales[num-11]);        //aqui estan los números especiales
         else if(num<100){
            int uni = num % 10;    //descomponemos los numeros y lo guardamos la variable uni
            int dec = num/10;       //aqui es lo mismo y lo guardamos en una variable uni
            if(uni == 0)
                System.out.print('\n' + np.getdecenas[dec-2]);                //aqui mostramos el numero que sale de las centenas
            else
                System.out.print('\n' + np.getDecenas()[dec-2]
                                       + " y " + np.getUnidades()[uni]); //mostramos ya el  resultado final de las decenas y las unidades ejemplo ingresamos 94 se mostrara noventa y cuatro
        }
        else            
            System.out.print("El numero debe ser menor a 100");//el numero no puede pasar a 100 tiene que ser menor a 100
  }    
}
    
        
       
