/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valasztasok;

import java.util.Scanner;

/**
 *
 * @author Diak
 */
public class Valasztasok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a file nevét");
        String fileName = sc.nextLine();
        Tasks t = new Tasks();
        t.readFromFile(fileName);
    }
}
