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
        
        // Devuelve el índice dentro de la cadena
        // de la primera aparición de la cadena a buscar
        // Este método me busca la palabra alboran (string) que le digo dentro de nuevo
        // y me da la posición donde empieza.
        // Tiene en cuenta mayúsculas y minúsculas - Si no existe me da negativo.
        int indice = nuevo.indexOf("alboran");
        System.out.println("Indice: " + indice);
        
        // Empieza a buscar lo que le señalo, en este caso "ran", a partir de 
        //la posición que le marco, en este caso 10.
        indice = nuevo.indexOf("ran", 10);
        System.out.println("Indice: " + indice);
        
        // Métodos equals y equalsIgnoreCase
        System.out.println("Igualdad Java y java: " + "Java".equals("java"));
        System.out.println("Igualdad Java y java: " + "Java".equalsIgnoreCase("java"));
    }
}
