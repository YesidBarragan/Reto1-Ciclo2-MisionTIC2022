/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author Yesid93
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int capas = sc.nextInt();

        String n1 = " that I groot";
        String n2 = " that I am";

        System.out.print("I am");
        for (int i = 0; i < capas - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(n1);
            } else {
                System.out.print(n2);
            }
        }
        System.out.print(" it");

    }
}
