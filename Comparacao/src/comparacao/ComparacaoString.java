/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacao;

/**
 *
 * @author silvana
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declarando um mesmo objeto de maneira diferente
        // string com letra maiuscula e uma classe e cria 
        // um objeto
        String nome1 = "Silvana";
        String nome2 = "Silvana";
        String nome3 = new String("Silvana");
        String res ;
        res= (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
                
    }
    
}
