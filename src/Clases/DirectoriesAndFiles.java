package Clases;

import javax.swing.text.DateFormatter;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DirectoriesAndFiles {

    private static Scanner sc = new Scanner (System.in);
    public static final String PATHSTRING = "write the path down below";
    public static final String NAMESTRING = "Write de name of that brand new file";
    public static final String PADCSTRING = "Write the directory path down below:";
    public static final String PATTERN ="[a-zA-Z]";







    /**
     * 3-
     * Crea el método muestraContenido que recibe una ruta y devuelve un array con
     * un listado con los nombres de los ficheros y carpetas contenidos en ella, ordenados
     * alfabéticamente
     */






    /**
     * Crea un método que reciba la ruta de un archivo de texto y devuelva un array de
     * objetos con los caracteres del alfabeto ordenados según su frecuencia de aparición (primero el
     * carácter que más veces aparece, luego el segundo que más aparece, etc), indicando también el
     * número de veces que aparece cada carácter.


    private static char[][] crearPatron(String pattern){
        char[] patternCharArray = pattern.toCharArray ( );
        char[][] charArray = new char[27][];
        for(int i = 0; i < charArray.length; i++) {
            char[] support = new char[10000];

                support[0] = patternCharArray[i];

            charArray[i] = support;
        }
        return charArray;
}

    public static Map<Character, Integer> fileCharacterCharArray(String path) {
        String output = txtReader (new File (path));//Llamo a una clase de utilidad para leer un fichero y guardarlo en un string
        HashMap<Character, Integer> elMapa = (HashMap)createCharMap();
        char[] patternArray = PATTERN.toCharArray();
        for (int j = 0; j < output.length ( ); j++) {
            boolean match = false;
            for (int k = 0; k < PATTERN.length ( ) && !match; k++) {
                if(elMapa.get(patternArray[j]) == patternArray[k]){

                }

            }

        } return elMapa;
    }

    public static Map<Character, Integer> ordenarYContarCaracteres(Map<Character, Integer> charMap) {
        Map<Character, Integer> caracteres = new HashMap<>();
        for (int i = 0; i < charMap.size(); i++) {
            int contador = 0;
            for (int j = 0; j < charArray[i].length; j++) {
                charMap.get();
            }
            return caracteres;
        }

    }
    private static Map<Character, Integer> createCharMap(){
        char[] stringChar = PATTERN.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
            for(int j = 0; j < stringChar.length; j++){
               charMap.put(stringChar[j], 0);
            }
    return charMap;
    } */

}