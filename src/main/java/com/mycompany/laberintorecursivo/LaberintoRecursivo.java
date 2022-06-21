/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.laberintorecursivo;

/**
 *
 * @author luisa
 */
public class LaberintoRecursivo {
    
    static char[][] laberintoPrincipal =
            {
                    {'#','#','#','#','#','#','#','#','#','#','#','#'},
                    {'#',' ', '#','#','#','#','#','#','#','#','#','#'},
                    {'#',' ', ' ','#','#',' ',' ',' ',' ',' ','#','#'},
                    {'#','#', ' ','#','#',' ','#','#','#',' ','#','#'},
                    {'#','#', ' ','#','#',' ',' ',' ','#',' ','#','#'},
                    {'#','#', ' ','#','#',' ','#','#','#',' ','#','#'},
                    {'#','#', ' ',' ','#',' ','#',' ','#',' ','#','#'},
                    {'#','#', ' ','#','#',' ','#',' ','#',' ','#','#'},
                    {'#','#', ' ','#','#',' ',' ',' ','#',' ','#','#'},
                    {'#','#', ' ',' ',' ',' ','#','#','#',' ','#','#'},
                    {'#','#', '#','#','#','#','#','#','#',' ',' ','#'},
                    {'#','#','#','#','#','#','#','#','#','#','#','#'}};

    public static void main(String[] args) {
        
         Laberinto laberinto = new Laberinto(laberintoPrincipal);
        if(laberinto.ResolucionLaberinto(1,1) == true){
            System.out.println(" ");
            System.out.println("FELICIDADES, LABERINTO RESUELTO.");
        }else{
            System.out.println(" ");
            System.out.println("QUE LASTIMA, EL LABERINTO NO ES POSIBLE.");
        }
    }
}
