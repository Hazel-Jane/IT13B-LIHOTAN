/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class lab_act1_arithmetic {
    public static void main(String[] args) {
        
                
        int x;
        int y;
        int z;

        Scanner in = new Scanner(System.in);

        System.out.println("Input First Number: ");
        x = in.nextInt();

        System.out.println("Input Second Number: ");
        y = in.nextInt();

        System.out.println("Input third Number: ");
        z = in.nextInt();
        
        System.out.println(x + " x " + y + " + " + z + " = " + (x * y + z));
       System.out.println(x + " - " + y + " % " + z + " = " + (x - y) % z);
       System.out.println(x + " + " + z + " + " + y + " / " + "3" + "  = " + (x + z + y) / 3);
       System.out.println(x + " x " + z + " - " + y + " * " + y + " = " + (x * z - (y * y)));
       
               }
}
