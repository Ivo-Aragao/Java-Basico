/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadecidadao;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class IdadeCidadao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
               System.out.println("qual o ano de nascimento?");
                float nasc = teclado.nextFloat();
                
                float idade = (2022 - nasc);
                System.out.println("a idade dele é: " + idade);
                
                if (idade>=18){
                    System.out.println("maior de idade!");
                }else{
                    System.out.println("menor de idade!");
                } 
                    
                     
                
                
    }
    }
    

