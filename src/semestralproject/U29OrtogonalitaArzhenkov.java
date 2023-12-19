/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semestralproject;

import java.util.Scanner;

/**
 * 1. This program performs operations on vectors, such as determining their
 * orthogonality and normalization.
 *
 * @author: Oleksii Arzhenkov
 * @version: 0.2 18.12.23
 */
public class U29OrtogonalitaArzhenkov {

    /*
     * Hlavni metoda, ktera spousti uzivatelske rozhraní.
     */
    public static void main(String[] args) {
        Ortogonalita();
    }

    /*
     * Metoda pro fazy nacitani a vypisu.
     */
    public static void Ortogonalita() {
        boolean work = true;
        while (work) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pocet vektoru: ");

            if (!sc.hasNextInt()) {
                System.out.println("Nespravny vstup. Musite zadat cele cislo.");
                sc.next();
                continue;
            }

            int n = sc.nextInt();

            if (n <= 0) {
                work = false;
                break;
            }

            double[][] vectors = new double[n][n];

            System.out.println("Zadej vektory ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    while (!sc.hasNextDouble()) {
                        System.out.println("Nespravny vstup. Zadej vektor znovu.");
                        sc.next();
                    }
                    vectors[i][j] = sc.nextDouble();
                }
            }

            boolean isOrth = isOrthogonalSys(vectors);
            if (isOrth) {
                System.out.println("System je ortogonalni");

                normalVectors(vectors);
                System.out.println("Normalizovany system");
                printVectors(vectors);
            } else {
                System.out.println("System neni ortogonalni");
            }
            System.out.println("");
        }
    }

    /**
     * Metoda pro normalizaci vektoru.
     *
     * @return 2D pole vektoru
     */
    public static void normalVectors(double[][] vectors) {
        for (int i = 0; i < vectors.length; i++) {
            double norm = Math.sqrt(scalarProduct(vectors[i], vectors[i])); // Vypocitavame normu vektoru podle formule "sqrt(u1^2+u2^2+...+un^2)"
            for (int j = 0; j < vectors[i].length; j++) {
                vectors[i][j] /= norm; //Vypocitavame norvalovy vektor podle formule "u1/@norm", u2/@norm, ..., un/@norm"
            }
        }
    }

    /**
     * Metoda pro vypocet skalarneho soucinu.
     *
     * @return Skalarni soucin vektoru
     */
    public static double scalarProduct(double[] u, double[] v) {
        double result = 0;
        for (int i = 0; i < u.length; i++) {
            result += u[i] * v[i];
        }
        return result;
    }

    /**
     * Metoda pro zjisteni ortogonality. nacita vectors = 2D pole vektoru
     *
     * @return True, pokud je system ortogonalni; jinak False
     */
    public static boolean isOrthogonalSys(double[][] vectors) {
        boolean orthogonal = true;
        for (int i = 0; i < vectors.length; i++) {
            for (int j = i + 1; j < vectors.length; j++) {
                if (scalarProduct(vectors[i], vectors[j]) != 0) { // Pokud neni skalarni soucin vektoru nulovy, vektory nejsou ortogonalni  
                    orthogonal = false;
                }
            }
            if (scalarProduct(vectors[i], vectors[i]) == 0) { // Pokud je skalarni soucin vektoru sam se sebou nulovy, vektor neni ortogonalni
                orthogonal = false;
            }
        }
        return orthogonal;
    }

    /*
     * Metoda pro vypis vektoru.
     */
    public static void printVectors(double[][] vectors) {
        for (double[] vector : vectors) {                                       // Prochazime vsechny vektory v poli vektoru
            for (double component : vector) {                                   // Prochazime vsechny slozky vektoru
                int components = (int) component;                               // Prevadime slozky vektoru na cela cisla a vypisujeme je oddelene mezerou
                System.out.print(components + " ");
            }
            System.out.println("");
        }
    }


    /*public static void testLogic(String[] args) {
        double[][] matrix = {
        {2, 0, 0, 0},
        {0, 5, 0, 0},
        {0, 0, 0, 4},
        {0, 0, 3, 6} };

        normalVectors(matrix);
        isOrthogonalSys(matrix);
        printVectors(matrix);
        
        
    }*/
}
