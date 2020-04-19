/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandohora;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author silvana
 */
public class TestandoAno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar ano = Calendar.getInstance();
       System.out.println(ano.get(Calendar.YEAR));
               
    }
    
}
