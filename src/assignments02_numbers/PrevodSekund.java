/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments02_numbers;

import java.util.Scanner;

public class PrevodSekund {
    
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Zadejte pocet hodin: ");
        int hod= sc.nextInt();
        System.out.print("Zadejte pocet minut: ");
        int min= sc.nextInt();
        System.out.print("Zadejte pocet sekund: ");
        int sek= sc.nextInt();
        
        int celSekundy= hod * 3600 + min * 60 + sek;
        System.out.println("Celkovy cas v sekundach je: " + celSekundy + " sekund");
        
        System.out.print("Zadejte celkovy pocet sekund: ");
        int celSekVstup= sc.nextInt();

        int hodVystup= celSekVstup / 3600;
        int minVystup= (celSekVstup % 3600) / 60;
        int sekVystup= celSekVstup % 60;

        System.out.format("Casovy udaj: %02d:%02d:%02d", hodVystup, minVystup, sekVystup);
            
    }
    
}
