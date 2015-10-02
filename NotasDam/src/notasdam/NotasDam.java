/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasdam;

import java.util.Scanner;

/**
 *
 * @author Juan Jose Moya
 */
public class NotasDam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al evaluador de notas");
        System.out.println("Introduce un numero");
        Scanner num=new Scanner(System.in);
        int nota=num.nextInt();
        //comprobacion de la nota
        if(nota<0||nota>10)
            System.out.println("Datos incorrectos");
        else{
            if(nota<=6)
                System.out.println("Estas suspenso con un "+nota);
            else
                System.out.println("Estas aprobado con un "+nota);
        }
    }
    
}
