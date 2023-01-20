package lab1p2_andreazelaya;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Lab1P2_AndreaZelaya {
static Scanner in = new Scanner(System.in);    
    public static void main(String[] args) throws ParseException {
        int opc;
        do{
            System.out.println("MENU\n"
                    + "1. Ejercicio 1\n"
                    + "2. Ejercicio 2\n"
                    + "3. Ejercicio 3\n"
                    + "4. Salida\n"
                    + "Ingrese la opcion a usar: ");
            opc = in.nextInt();
            
            switch (opc){
                case 1:{
                    System.out.println("Ingrese la cantidad de discos: ");
                    int discos = in.nextInt();
                    hanoi(discos,1,2,3);
                    break;
                }
                
                case 2:{
                    System.out.println("Ingrese un string: ");
                    String string = in.next();
                    
                    fechas(string);
                            
                    break;
                }
                
                case 3:{
                    System.out.println("Ingrese el limite: ");
                    int k = in.nextInt();
                    
                    System.out.println(pi(0,k,0)*4);
                    break;
                }
            }
        }while (opc != 4);
    }
    
    public static void hanoi(int n, int origen, int auxiliar, int destino){
      
        if(n == 1){
            System.out.println(" mover disco " + n + " de " + origen + " a " + destino);
        }
        else{
            hanoi(n-1, origen,destino,auxiliar);
            System.out.println(" mover disco " + n + " de " + origen + " a " + destino);
            hanoi(n-1, auxiliar,origen,destino);
        }
        
    }
    
    public static void fechas (String string) throws ParseException{
        Date fecha;
        String[] array = string.split(",");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        for (int i = 0; i < array.length; i++) {
            if(array[i].contains("/") && array[i].length()==10){
                fecha = df.parse(array[i]);
                System.out.println(fecha);
            }
        }
    }
    
    public static double pi (int n, int k, double suma){
        if(n == k){
            suma = Math.pow(-1, n)/(2*n +1);
            
            return suma;
        }
        else{
            suma = Math.pow(-1, n)/(2*n +1);
            return suma + pi(n+1 , k, suma);
        }
    }
    
}
