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
        
        // Comparación de cadenas (diccionario)
        // Devuelve cero si las cadeas son iguales, un negativo si s1 está
        // antes de s2 en el diccionario (menor) o un positivo si s1 está
        // después de s2 (mayor) - Lo usaremos mucho.
        
        int compareTo = s1.compareTo(s1);
        //Me devuelve cero porque son iguales, estamos comparándolo consigo mismo.
        System.out.println("Comparación de s1 y s1: " + compareTo);
        
        compareTo = s1.compareTo("aes");
        System.out.println("Comparación de s1 y aes: " + compareTo);
        
        compareTo = "aes".compareTo(s1);
        System.out.println("Comparación de aes y s1: " + compareTo);
        
        // Conversión mayúsculas y minúsculas
        String mayusculas = s2.toUpperCase();
        System.out.println("s2 en mayúsculas: " + mayusculas);
        System.out.println("String mayusculas en minúsculas " + mayusculas.toLowerCase());
        
        // Método que nos quita los espacios por delante y por detrás (no en medio)
        String espacios = " palabra palabra ";
        System.out.println("Tamaño de espacios: " + espacios.length());
        String sinEspacios = espacios.trim();
        System.out.println("Tamaño de sinEspacios: " + sinEspacios.length());
        
        // Reemplazo de caracteres
        System.out.println("String original: " +  s2);
        String str2 = s2.replace('a', 'x');
        System.out.println("String reemplazado: " + str2);
        
        // Contenido - Me dice si está o no está en el contenido.
        String aBuscar = "dealbo";
        System.out.println("¿Contiene " + s2 + " la subcadena " + aBuscar + "? " + s2.contains(aBuscar));
        
        // Probar métodos endsWith, startsWith, isEmpty
        
        
        // Obtener un array de char de la cadena
        // Todo el array tiene que tener el mismo tipo de dato (en este caso char)
        // Declaración de una variable array de tipo char
        char[] arrayChar;
        arrayChar = s2.toCharArray();
        
        // Aquí length es un atributo del array - diferente al lengt de los String
        // El atributo length exite en todos los arrays y me indica su tamaño
        // equivalente al método length de los String. Se diferencian en que uno
        // es un método y otro es un atributo.
        for(int i = 0; i<arrayChar.length; i++){
            //Para acceder a cada posición del array uso los corchetes
            System.out.println("Posición i = " + i + " contenido = " + arrayChar[i]);
        }
    }
}
