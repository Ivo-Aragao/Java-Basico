/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadevotar;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class IdadeVotar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("digite ano de nascimento: ");
             float idade = teclado.nextFloat();
             float n1 = (2022 - idade);
             System.out.println("A idade dele é: " + n1);
             
             if (n1 < 16){
                 System.out.println("não pode votar!");
             }else{
                 if ((n1 >= 16 && n1< 18) || (n1 > 70)){
                     System.out.println("voto opcional");
                 }else{
                     if (n1 >= 18) {
                    System.out.println("voto obrigatorio");
                     }
                 }
        
    }
                  
        
    }
    
}
