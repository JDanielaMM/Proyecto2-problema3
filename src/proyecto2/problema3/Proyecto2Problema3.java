/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.problema3;
import java.util.Scanner;
/**
 *
 * @author danii
 * Johanna Daniela Macías Martínez A01411534
   Iván Constantino Hernández A01411529
   Maythe Portales Barrios A01411461
   Luisa Fernanda Sosa Brambila A01411485
 */
public class Proyecto2Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano=solicitaentero("el tamaño del arreglo: ");
        int [][]a=arreglo("A",tamano);
      imprimirarreglo("A",a);
    }
    
    public static int solicitaentero(String b){
        Scanner key=new Scanner (System.in);
        int a=0;
        boolean flag=true;
        do{
            try{
                System.out.println("Escribe "+b);
                a=key.nextInt();
                flag=false;
            }
            catch(Exception e){
                System.out.println("Error");
                key.next();
                flag=true;
                
            }
        }
        while(flag);
        return a;
    }
    
    public static int[][] arreglo(String a,int tamano){
        int [][]arreglo= new int [tamano][tamano];
        System.out.println("Arreglo "+a);
      
        for (int i=0; i<arreglo.length;i++){
        for (int j=0;j<arreglo[i].length;j++){
        arreglo[i][j]= solicitaentero("un número entero: ");
        }
        }
        return arreglo;
        }
    

    public static void imprimirarreglo(String b,int [][]a){
        System.out.println("Arreglo "+ b);
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            for(int k=0;k<a[i][j];k++){
            System.out.print("*");
        }
            System.out.print("-");
        }
            
            System.out.println("");
        }

        
    
    
}}
