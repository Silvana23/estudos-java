/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author silvana
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecl = new Scanner(System.in);
        System.out.print("primeira nota");
        float n1 = tecl.nextFloat();
        System.out.println("segunda nota");
        float n2 = tecl.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("sua media e "  + m);
        if (m>9){
            System.out.println("PARABENS!!!!");
        }
    
                }
    
    
}
