/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semestralproject;
import java.util.Scanner;
public class U29OrtogonalitaArzhenkov {

    public static void Ortogonalita() {
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Pocet vektoru ");
            int n = sc.nextInt();
            
            if (n <= 0) {
                work = false;
                break;
            }
            
            double[][] vectors = new double[n][n];
            
            System.out.println("Zadej vektory ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    vectors[i][j] = sc.nextDouble();
                }
            }
            
            boolean isOrth = isOrthSys(vectors);
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
    
    public static void normalVectors(double[][] vectors) {
        for (int i = 0; i < vectors.length; i++) {
            double norm = Math.sqrt(DOT(vectors[i], vectors[i]));
            for (int j = 0; j < vectors[i].length; j++) {
                vectors[i][j] /= norm;
            }
        }
    }
    
    public static double DOT(double[] u, double[] v) {
        double result = 0;
        for (int i = 0; i < u.length; i++) {
            result += u[i] * v[i];
        }
        return result;
    }

    public static boolean isOrthSys(double[][] vectors) {
        boolean ort = true;
        for (int i = 0; i < vectors.length; i++) {
            for (int j = i + 1; j < vectors.length; j++) {
                if (DOT(vectors[i], vectors[j]) != 0) {
                    ort = false;
                }
            }
            if (DOT(vectors[i], vectors[i]) == 0) {
                ort = false;
            }
        }
        return ort;
    }
    
    /*public static void printVectors(double[][] vectors) {
        for (int i = 0; i < vectors.length; i++) {
            for (int j = 0; j < vectors[i].length; j++) {
                System.out.print(vectors[j] + " ");
            }
            System.out.println();
        }
    }*/
    
    public static void printVectors(double[][] vectors) {
        for (double[] vector : vectors) {
            for (double comp : vector) {
                int comps = (int) comp;
                System.out.print(comps + " ");
            }
            System.out.println();
        }
    }
}
