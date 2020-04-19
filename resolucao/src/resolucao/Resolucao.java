/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucao;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.PrintStream;

/**
 *
 * @author silvana
 */
public class Resolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension d = tk.getScreenSize();
     
     System.out.println("a resolução da tela e : " + d.width  +  "x"  +  d.height);
    }
    
}
