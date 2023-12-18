/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semestralproject;

import java.util.Scanner;

public class ChrismasVanocniDekoraceArzhenkov {

    public static void Xmas() {
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.print("Zadej radius: ");
            int radius = sc.nextInt();
            if (radius <= 0) {
                work = false;
                break;
            }
            char outside = ('$');
            char firstSymbol = ('*');
            char secondSymbol = ('#');

            hook(radius, outside);
            drawCircle(radius, firstSymbol, secondSymbol, outside);

            for (int i = 0; i < radius; i++) {
                System.out.print("  ");
            }
            System.out.print(outside);
            System.out.println("");
        }

    }

    public static void hook(int radius, char outside) {
        for (int i = 0; i < radius - 1; i++) {
            System.out.print("  ");
        }
        System.out.print("- - -");
        System.out.println("");

        for (int i = 0; i < radius - 2; i++) {
            System.out.print("  ");
        }
        System.out.print("/       \\");
        System.out.println("");

        for (int i = 0; i < radius + 2; i++) {
            System.out.print("  ");
        }
        System.out.print("|");
        System.out.println("");

        for (int i = 0; i < radius + 2; i++) {
            System.out.print("  ");
        }
        System.out.print("/");
        System.out.println("");

        for (int i = 0; i < radius - 1; i++) {
            System.out.print("  ");
        }
        System.out.print("- - -");
        System.out.println("");
        for (int i = 0; i < radius - 1; i++) {
            System.out.print("  ");
        }
        System.out.println("| " + outside + " |");
    }

    public static void drawCircle(int radius, char firstSymbol, char secondSymbol, char outside) {
        boolean useHash = true;
        for (int i = -radius + 1; i < radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    if ((i * i) + (radius - 1) + (j * j) + (radius - 1) >= radius * radius) {
                        System.out.print(outside + " ");
                    } else {
                        if (useHash) {
                            System.out.print(firstSymbol + " ");
                        } else {
                            System.out.print(secondSymbol + " ");
                        }
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            if (i % 2 == 0) {
                useHash = !useHash;
            }
        }

    }

}
