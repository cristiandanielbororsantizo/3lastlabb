/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int c;
        int r;
        
        System.out.println("ingrese valor de A");
        Scanner n1 = new Scanner (System.in);
        a = n1.nextInt();
        
        System.out.println("ingrese valor de c");
        Scanner n2 = new Scanner (System.in);
        c = n2.nextInt();
        
        r = a/c;
        
        System.out.println(c);
        // TODO code application logic here
    }
    
}
