/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandoidade;

import java.util.Scanner;

/**
 *
 * @author silvana
 */
public class TestandoIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecl = new Scanner(System.in);
        System.out.print("Em que ano voce nasceu?");
        int nasc = tecl.nextInt();
        int i = 2020 - nasc;
        System.out.println("Sua idade e "  + i);
        if (i>=18){
            System.out.println("MAIOR");
        }else{
            System.out.println("MENOR");
        }
        
    }
    
}
