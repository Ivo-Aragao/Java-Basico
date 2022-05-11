/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n, s=0;
        do{
       n = Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME UM NUMERO: (valor 0 interrompe)"));
       s = n + s;
        
        }while(n!=0);
      JOptionPane.showMessageDialog(null, "<html>resultado final é: " + "soma dos numeros é " + s + "</html>");
    } 
    
}
