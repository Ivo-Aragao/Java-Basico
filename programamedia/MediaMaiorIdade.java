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
public class MediaMaiorIdade {
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
                float nasc = teclado.nextFloat();
                
                float idade = (nasc - 2022);
                System.out.println("a idade dele é: ");
                
                if (idade>=18){
                    System.out.println("maior de idade!");
                }else{
                    System.out.println("menor de idade!");
                } 
                    
                     
                
                
    }
}
