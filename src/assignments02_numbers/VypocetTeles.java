/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments02_numbers;

import java.util.Scanner;

public class VypocetTeles {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Zadejte delku strany a: ");
        double a= sc.nextDouble();
        System.out.print("Zadejte delku strany b: ");
        double b= sc.nextDouble();
        System.out.print("Zadejte delku strany c: ");
        double c= sc.nextDouble();
        
        double objKv= a*b*c;
        double hrKry= Math.cbrt(objKv);
        double plPlaKv= 2*(a*b+b*c+a*c);
        double plPlaKry= 6*a*a;
        double polKoule= a/2;
        double plPlasKoule= 4*Math.PI*Math.pow(polKoule, 2);
        double plPlasCty= 3*Math.pow(a, 2);

        System.out.println("Objem kvádru: "+objKv);
        System.out.println("Délka strany krychle s tímto objemem: "+hrKry);
        System.out.println("Plocha pláště kvádru: "+plPlaKv);
        System.out.println("Plocha pláště krychle: "+plPlaKry);
        System.out.println("Plocha pláště koule: "+plPlasKoule);
        System.out.println("Plocha pláště pravidelného čtyřstěnu: "+plPlasCty);
    }
    
}
