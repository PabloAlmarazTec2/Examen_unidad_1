/*
aqui usamos una condicion if e imprimimos todos los datos ingresados por el usuario
 */
package instituto;

import java.util.Scanner;

/**
 *
 * @author  Pablo Aaron Almaraz Avalos 18550326
 */
public class Instituto {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sp = new Scanner(System.in);
        datos bdatos = new datos();
        System.out.println("digite los sig datos : ");
         System.out.println("nombre");
        bdatos.setNombre(sp.nextLine());
         System.out.println("Apellido");
        bdatos.setApellido(sp.nextLine());
         System.out.println("Carrera");
        bdatos.setCarrera(sp.nextLine());
         System.out.println("Direccion");
        bdatos.setDireccion(sp.nextLine());
         System.out.println("Correo");
        bdatos.setCorreo(sp.nextLine());
         System.out.println("Año");
        bdatos.setAño(sp.nextInt());
          System.out.println("Mes");
        bdatos.setMes(sp.nextInt());
          System.out.println("Edad");
        bdatos.setEdad(sp.nextInt());
          System.out.println("numero de control");
        bdatos.setNum_control(sp.nextInt());                //ahi digitamos le pedimos toda la informacion al usuario
        
     //despues vamos a comparar el mes que tecleo el usuario con los numeros de los meses con una condicion if y asi si alguno coincide
     //mostrarlo con su respectivo mes en letra
           if(mes==1){
        mes1="Enero";
        }else if(mes==2){
          mes1="Febrero";  
        }else if(mes==3){
        mes1="Marzo";
        }else if(mes==4){
        mes1="Abril";
        }else if(mes==5){
            mes1="Mayo";
        }else if(mes==6){
            mes1="Junio";
        }else if(mes==7){
            mes1="Julio";
        }else if(mes==8){
            mes1="Agosto";
        }else if(mes==9){
            mes1="Septiembre";
        }else if(mes==10){
            mes1="Octubre";
        }else if(mes==11){
            mes1="Noviembre";
        }else if(mes==12){
              mes1="Diciembre";
        }else{
            System.out.println("No existe la fecha ");
         bdatos.getMes1();
        }
           //por ultimo son los datos ingresados por el usuario + la fecha como lo especifico
        System.out.println("los datos del alumno son:");
        System.out.println("nombre "+bdatos.getNombre()+"   "+bdatos.getApellidos());
        System.out.println("direccion  "+bdatos.getDireccion());
        System.out.println("correo   "+bdatos.getCorreo());
        System.out.println("carrera  "+bdatos.getCarrera());
        System.out.println("numero de control  "+bdatos.getNum_control());
        System.out.println("edad"+bdatos.getEdad());
        System.out.print("Fecha de nacimiento:  "+bdatos.getDia()+" "+bdatos.getMes()+" del "+ bdatos.getAño());
        
    }
    
}
