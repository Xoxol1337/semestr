/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments03;

import java.util.Scanner;

public class c152 {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Zadejte prvni cast rodneho cisla: ");
        int one = sc.nextInt();
        System.out.print("Zadejte druhou cast rodneho cisla: ");
        int two = sc.nextInt();
        boolean valid;
        String oS = Integer.toString(one);
        String tS = Integer.toString(two);
        String bNumb = oS+tS;
        int nineDigits= Integer.parseInt(bNumb.substring(0, 9));
        int end=nineDigits % 11;
        int lastDigit = Integer.parseInt(bNumb.substring(9));
        if (end == 10) {
            valid = lastDigit == 0;
        }
        else {
            valid = end == lastDigit;
        
        }
        System.out.println(valid);
             
    }
    
}
