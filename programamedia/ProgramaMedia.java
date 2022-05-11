/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("nota da n1:");
        float n1 = teclado.nextFloat();
        System.out.println("nota da n2:");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
           System.out.println("media do aluno:" + (n1 + n2)/2);
           
               if (m>9) {
                   
                System.out.println("Parabens");
                
             
        }else{
                   System.out.println("cara voce é burro!");
               }
           
                
              
    }
    
}
