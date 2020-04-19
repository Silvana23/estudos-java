/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programasemana;

import java.util.Scanner;

/**
 *
 * @author silvana
 */
public class ProgramaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("escolha um numero entre 1 e 5  ");
        int numero = tec.nextInt();
        String tipo;
        System.out.print("você trabalhará  ");
        switch (numero) {
        case 1:
        tipo = "segunda";
        break;
        case 2 :
        tipo = "quinta";
        break;
        case 3 :
            tipo ="terça";
        break;
        case 4 :
            tipo ="quarta";
        break;
        case 5 :
            tipo ="sexta";
        break;
        default : 
            tipo ="sabado";
          
        
                
                
                
    }
        System.out.println( tipo  );
    }
    
}
