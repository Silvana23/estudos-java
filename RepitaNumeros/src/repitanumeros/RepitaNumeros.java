/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repitanumeros;

import javax.swing.JOptionPane;

/**
 * .
 *
 * @author silvana
 */
public class RepitaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 0;
        int s = 0;
        double m = 0;
        int  q = 0;
        int p = 0;
        int i = 0;
        
        do{
          n = Integer.parseInt(JOptionPane.showInputDialog(null ,
     "<html>  informe um numero :<br><em>(valor 0 interrope)</em></html>"));
           
        s += n;
        
        if(n%2 ==0){
            p++;
        }else{
            i++;
        }
        
        }
        while (n !=0);
        JOptionPane.showInputDialog(null, "<html> INFORME UM NUMERO<br><hr>" +  "somatorio vale " + s  +"<br>numeros pares " + p + 
         "<br>numeros impares "+ i  +  "</html>");

    }
              /*  soma = soma + numero;
                qtde++;
                media = Double.valueOf(soma) / Double.valueOf(qtde);
                if (numero % 2 == 0) {
                    qtdePar++;
                } else {
                    qtdeImpar++;
                }
                System.out.println("Soma: " + soma);
                System.out.println("Quantidade de numeros: " + qtde);
                System.out.println("Media: " + media);
                System.out.println("Quant de numeros pares: " + qtdePar);
                System.out.println("Quant de numeros impares: " + qtdeImpar);
            } 
        }
        