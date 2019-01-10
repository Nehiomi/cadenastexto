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
        
        // Obtener el char de una posición concreta - le digo que posición quiero que me dé
        // en este caso la posición 5 que corresponde a la letra r ya que empieza a contar
        // desde cero.
        System.out.println("Char asociado a la posición 5: " + s.charAt(5));
        
        // Obtener subcadena desde el caracter i-ésimo hasta el final de la cadena
        String subcadena = s.substring(3);
        System.out.println("Subcadena = " + subcadena);
        
        // Obtener subcadena desde el caracter i-ésimo hasta el caracter j-ésimo de la cadena
        // Hay que poner hasta el 15 porque el 14 no lo recoge es index menos 1
        subcadena = s.substring(8, 15);
        System.out.println("Subcadena = " + subcadena);
        
        // Concatener cadenas. Equivale al operador + 
        // Dos maneras de hacerlo
        String s1 = "ies";
        String s2 = "mardealboran.com";
        String nuevo = s1 + s2;
        String nuevo2 = s1.concat(s2);
        System.out.println("Nuevo: " + nuevo);
        System.out.println("Nuevo2: " + nuevo2);
    }
}
