/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos2;

import java.util.Scanner;

/**
 *
 * @author silvana
 */
public class TiposPrimitivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //interajindo com o usuario
        //entrada de dados
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite  o nome do aluno");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n" , nome , nota);
        
    }
    
}
