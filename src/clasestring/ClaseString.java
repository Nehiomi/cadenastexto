/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestring;

/**
 *
 * @author naomi
 */
public class ClaseString {
    public static void main(String[] args) {
        
        String s = "iesmardealboran.com";
        
        // Tamaño de la cadena (nos dirá que la cadena tiene 19 caracteres)
        System.out.println("Tamaño: " + s.length());
        
        //Obtener el char de una posición concreta - le digo que posición quiero que me dé
        //en este caso la posición 5 que corresponde a la letra r ya que empieza a contar
        //desde cero.
        System.out.println("Char asociado a la posición 5: " + s.charAt(5));
    }
}
