/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments02_numbers;

import java.util.Scanner;

public class UroceniVkladu {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.print("Zadejte pocatecni kapital: ");
       double K0= sc.nextDouble();
       System.out.print("Zadejte rocni uroceni v procentech: ");
       double u= sc.nextDouble()/100;
       System.out.print("Zadejte pocet urokovacich obdobi za rok: ");
       int m= sc.nextInt();
       System.out.print("Zadejte pocet let: ");
       int n= sc.nextInt();
       double Kn= K0*Math.pow(1+u/m, n*m);
       System.out.println("Vysledna hodnota kapitalu po " + n + " letech je: " + Kn);
       
    }
    
}
