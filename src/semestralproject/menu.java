/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semestralproject;

import java.util.Scanner;
import semestralproject.ChrismasVanocniDekoraceArzhenkov;
import semestralproject.U29OrtogonalitaArzhenkov;

public class menu {

    public static void main(String[] args) {
        char choice;
        boolean work = true;

        Scanner sc = new Scanner(System.in);
        while (work) {
            System.out.println("Vyberte ulohu:");
            System.out.println("1. Ortogonalita");
            System.out.println("2. Vanocni dekorace");
            System.out.println("0. Konec programu");

            choice = sc.next().charAt(0);

            switch (choice) {
                case '1':
                    U29OrtogonalitaArzhenkov.Ortogonalita();
                    break;
                case '0':
                    System.out.println("Konec programu");
                    work = false;
                    break;
                case '2':
                    ChrismasVanocniDekoraceArzhenkov.Xmas();
                    break;
                default:
                    System.out.println("Spatny vyber, zkuste to znovu!");
                    break;
            }
        }
        sc.close();
    }

}
