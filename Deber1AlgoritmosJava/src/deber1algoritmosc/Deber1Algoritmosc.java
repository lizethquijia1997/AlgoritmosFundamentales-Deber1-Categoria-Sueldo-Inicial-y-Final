/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deber1algoritmosc;
import java.util.Scanner;

/**
 *
 * @author Usuario FDG
 */
public class Deber1Algoritmosc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  double sueldoInicial;
  int opcion;
  double Incremento1=0;
  double Incremento2=0;
  double Incremento3=0;
  double Incremento4=0;

  double nuevoSueldo1=0;
  double nuevoSueldo2=0;
  double nuevoSueldo3=0;
  double nuevoSueldo4=0;



  Scanner s= new Scanner (System.in);
  System.out.println("Ingrese el sueldo actual del empleado :");
  sueldoInicial=s.nextFloat();


System.out.println("Escribe 1 si se encuentra en la categoria 1");
System.out.println("Escribe 2 si se encuentra en la categoria 2");
System.out.println("Escribe 3 si se encuentra en la categoria 3");
System.out.println("Escribe 4 si se encuentra en la categoria 4");
opcion=s.nextInt();

switch(opcion){

  case 1:
  
  System.out.println("Categoria 1");

Incremento1= 0.15 * sueldoInicial;
nuevoSueldo1=Incremento1+sueldoInicial;
System.out.println("El sueldo incial fue: "+sueldoInicial);
System.out.println("El nuevo sueldo es:"+nuevoSueldo1);

  break;
  case 2:
    System.out.println("Categoria 2");
    Incremento2= 0.10* sueldoInicial;
nuevoSueldo2=Incremento2+sueldoInicial;
System.out.println("El sueldo incial fue: "+sueldoInicial);
System.out.println("El nuevo sueldo es: "+nuevoSueldo2);

  break;
  case 3:
     System.out.println("Categoria 3");
    Incremento3= 0.08* sueldoInicial;
nuevoSueldo3=Incremento3+sueldoInicial;
System.out.println("El sueldo incial fue: "+sueldoInicial);
System.out.println("El nuevo sueldo es: "+nuevoSueldo3);

  break;
  case 4:
    System.out.println("Categoria 4");
    Incremento4=(0.07) * sueldoInicial;
nuevoSueldo4=Incremento4+sueldoInicial;
System.out.println("El sueldo incial fue: "+sueldoInicial);
System.out.println("El nuevo sueldo es: "+nuevoSueldo4);

  break;
   
   default:
   System.out.println("ERROR esa opcion no existe");

}
    }
    
}
