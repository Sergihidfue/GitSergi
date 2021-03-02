/*
Author: Sergi Hidalgo
Date: 01/03/2021
 */
package m3.p24_arrays;

import java.util.Scanner;


public class M3P24_Arrays {

    
    static Scanner keyboard=new Scanner (System.in);
    public static void main(String[] args) {
    int option;
        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    Practice1();
                    break;
                case 2:
                    Practice2();
                    break;
                case 3:
                    Practice3();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("No valid option");
            }//fin de switch
        } while (option != 9);
    }

    private static void userMenu() {
        System.out.println("\n\n---------------------------------------");
        System.out.println("Exercices (1-8) | EXIT (9)");

        System.out.print("Exercice?: ");
    }
    
    private static void Practice1(){
        int[] array={40,32,13,79,19,23,14,64,71,10};
        int num;
        System.out.print("Tell me a number of array: ");
        num=keyboard.nextInt();
        System.out.println("The number you choose of array is "+array[num]);
    }
    
    private static void Practice2(){
        String Quantity;
        System.out.print("Tell me quantity of numbers in array: ");
        Quantity=keyboard.next();
        int num[]=new int[Integer.parseInt(Quantity)];
        
        for(int i=0;i<num.length;i++){
            //Generamos un número entre los parametros pasados
            num[i]=((int)Math.floor(Math.random()*(0-9)+9));
            System.out.println("Index: "+i+" Num: "+num[i]);
        }
    }
    private static void Practice3(){
        String[] array={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
    }
}
