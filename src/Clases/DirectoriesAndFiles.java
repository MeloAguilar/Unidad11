package Clases;

import javax.swing.text.DateFormatter;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DirectoriesAndFiles {

    private static Scanner sc = new Scanner (System.in);
    public static final String PATHSTRING = "write the path down below";
    public static final String NAMESTRING = "Write de name of that brand new file";
    public static final String PADCSTRING = "Write the directory path down below:";


    /**
     * 1-
     * Haz un subprograma que liste el contenido del directorio actual, usando File
     * <p>
     * Precondiciones: path debe ser una ruta validada
     */
    public static File[] getDirectoryContent(String path) {
        File directoryFiles = new File (path);
        File[] files = null;
        if (directoryFiles.exists ( )) {
            files = directoryFiles.listFiles ( );
        } else {
            System.out.println ("The directory you're looking for does not exist...");
        }
        return files;
    }


    /**
     * 2-
     * Usa los métodos File para indicar las propiedades y listar el contenido de un
     * archivo cuyo nombre será suministrado por el usuario
     */

    public static String getisHidenString(File file) {
        String isHiden = "";
        if (file.isHidden ( )) {
            isHiden = "this file is hidden";
        } else {
            isHiden = "this file is not hidden";
        }
        return isHiden;
    }


    /**
     * 2-
     * Método que comprueba y devuelve un String introducido por teclado por el
     * Usuario que debe ser un directorio.
     *
     * @return
     */
    public static String getDirectoryName() {
        File directory = null;
        var path = "";
        try {
            do {
                System.out.println (PADCSTRING);
                path = sc.nextLine ( );
                directory = new File (path);
            } while (!directory.exists ( ) && !directory.createNewFile ( ));
        } catch (IOException | SecurityException exception) {
            System.out.println ("Noze rmano");
        }
        return path;
    }


    /**
     * 3-
     * Crea el método muestraContenido que recibe una ruta y devuelve un array con
     * un listado con los nombres de los ficheros y carpetas contenidos en ella, ordenados
     * alfabéticamente
     */

    public static File[] showContent(String path) {
        File[] files = getDirectoryContent (path);
        Arrays.sort (files);
        return files;
    }


    /**
     * 4-
     * Realiza un programa para crear un fichero de texto que contenga las cadenas de
     * caracteres suministradas desde la línea de comandos, una en cada línea del fichero de texto.
     */

    /**
     * <h2>txtReader()</h2>
     * <p>
     * Método que lee un archivo y lo convierte
     * en un String separado por lineas.
     * <p>
     * Precondiciones:
     * Postcondiciones:
     *
     * @param file:
     * @return: String loco que contendrá el archivo completo
     * pasado a String
     */
    public static String txtReader(File file) {
        var loco = "";
        String madreMia;
        BufferedReader input = null;
        try {
            FileReader buffer = new FileReader (file);//Creamos el lector de caracteres
            input = new BufferedReader (buffer);//Creamos el lector de Strings
            while ((madreMia = input.readLine ( )) != null) {//mientras que la linea de Strings que lee input no sea null
                loco += madreMia + "\n";
            }//end while
            input.close ( );
        } catch (IOException e) {
            System.out.println ("Can´t open the file");
        }
        return loco;
    }


    /**
     * @return
     * @throws IOException
     */
    public static File createAndWriteFile() throws IOException {
        boolean exit = false;
        BufferedWriter output = null;
        File file = null;
        while (!exit) {
            try {
                System.out.println (NAMESTRING);
                String name = sc.nextLine ( );
                if (name.endsWith (".txt") || name.endsWith (".bin")) {
                    file = new File (name);
                    output = new BufferedWriter (new FileWriter (file));
                    do {
                        System.out.println ("Write a String down below");
                        String string = sc.nextLine ( );
                        output.write (string);
                        System.out.println ("do you want to keep writing? \n--yes       --no");
                        if (sc.nextLine ( ).equals ("no")) {
                            exit = true;
                        } else {
                            System.out.println ("Ok!");
                            output.newLine ( );
                        }
                    }
                    while (!exit);
                }
            } catch (IllegalArgumentException | SecurityException e) {
                System.out.println ("Something was not where it should be");
            } finally {
                if (output != null)
                    output.close ( );
            }
        }
        return file;
    }


    /**
     * Crea un método que reciba la ruta de un archivo de texto y devuelva un array de
     * objetos con los caracteres del alfabeto ordenados según su frecuencia de aparición (primero el
     * carácter que más veces aparece, luego el segundo que más aparece, etc), indicando también el
     * número de veces que aparece cada carácter.
     */

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

    public static char[][] fileCharacterTreeMap(String path) {
        String pattern = "abcdefghijklmnñopqrstuvwxyz";
        char[][] este = crearPatron (pattern);

        String output = txtReader (new File (path));
        char[] support = output.toCharArray ( );
        for (int j = 0; j < output.length ( ); j++) {
            boolean match = false;
            for (int k = 0; k < pattern.length ( ) && !match; k++) {
                if(pattern.toCharArray ()[k] == output.toCharArray ()[j]) {
                    este[k][j+1] += pattern.toCharArray ( )[k];
                    match = true;
                }
            }

        } return este;
    }

    public static Map<Character, Integer> ordenarYContarCaracteres(char[][] charArray) {
        TreeMap<Character, Integer> caracteres = new TreeMap<> ( );

        for (int i = 0; i < charArray.length; i++) {
            int contador = 0;
            for(int j = 0; j < charArray[i].length; j++) {
                if(charArray[i][j] == charArray[i][0])
                contador++;

            }
            caracteres.put (charArray[i][0], contador);
        }
        return caracteres;
    }

    private static TreeMap<Character, Integer> sortByInteger(Map<Character, Integer> characterIntegerTreeMap){
        for(int i = 0; i < characterIntegerTreeMap.size (); i++){
            for(int j = 0; j < characterIntegerTreeMap.size()-i; j++){
                if(characterIntegerTreeMap[i] > characterIntegerTreeMap[j])
            }
        }
    }

}