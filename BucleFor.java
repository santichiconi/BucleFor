/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclefor;

import java.util.Scanner;
/**
 *
 * @author chuPac
 */
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese 1er numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese 2do numero");
        int num2 = leer.nextInt();
        System.out.println("Ingrese 3ro numero");
        int num3 = leer.nextInt();
        System.out.println("Ingrese 4to numero");
        int num4 = leer.nextInt();
         
        if (num1>=1 && num1<=20 && num2>=1 && num2<=20 && num3>=1 && num3<=20 && num4>=1 && num4<=20)
        {
        
        
        System.out.print(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        
        System.out.println();
        
        System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        
        System.out.println();
        
        System.out.print(num3);
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        
        System.out.println();
        
        System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        
        System.out.println();
        
    }
        
            System.out.println("Los numeros son mayores o menores a lo pedido");
                
}
}

