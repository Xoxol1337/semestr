/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments02_numbers;

import java.util.Scanner;

public class UsekovaRychlost {

  
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Zadejte maximalni povolenou rychlost v km/h: ");
        int maxRych= sc.nextInt();
        System.out.print("Zadejte delku useku v metrech: ");
        double delUs = sc.nextDouble();
        System.out.print("Zadejte cas zacatku prujezdu (hh mm sec): ");
        int hhZac= sc.nextInt();
        int mmZac= sc.nextInt();
        int secZac= sc.nextInt();

        System.out.print("Zadejte cas konce prujezdu (hh mm sec): ");
        int hhKon= sc.nextInt();
        int mmKon= sc.nextInt();
        int secKon= sc.nextInt();
        int casZacSec= hhZac * 3600 + mmZac * 60 + secZac;
        int casKonSec= hhKon * 3600 + mmKon * 60 + secKon;
        int casPrujSec= casKonSec - casZacSec;
        double usRych= (delUs/1000.0)/(casPrujSec/3600.0);
        double pre = usRych-maxRych;
        
        System.out.printf("Usekova rychlost vozidla: %.2f km/h%n", usRych);
        if (pre>0) {
            System.out.printf("Vozidlo prekrovilo maximalni povolenou rychlost o " + pre + " km/h%n");
        } 
        else {
            System.out.println("Vozidlo neprekrovilo maximalni povolenou rychlost%n");
        }
        
    }
    
}
    
