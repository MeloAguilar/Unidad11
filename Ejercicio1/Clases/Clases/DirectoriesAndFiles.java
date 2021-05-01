package Clases;

import javax.swing.text.DateFormatter;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoriesAndFiles {
    /**
     * Haz un subprograma que liste el contenido del directorio actual, usando File
     */
    private static Scanner sc = new Scanner (System.in);
    public static final String PATHSTRING = "write the path down below";
    public static final String NAMESTRING = "Write de name of that brand new file";
    public static final String PADCSTRING = "Write the directory path down below:";

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
     * Usa los métodos File para indicar las propiedades y listar el contenido de un
     * archivo cuyo nombre será suministrado por el usuario
     */

    private static String getisHidenString(File file) {
        String isHiden = "";
        if (file.isHidden ( )) {
            isHiden = "this file is hidden";
        } else {
            isHiden = "this file is not hidden";
        }
        return isHiden;
    }
    /**
     * - Modifica el ejercicio anterior devolviendo un array de objetos que contengan el
     * nombre de un fichero o carpeta dentro de la ruta recibida, si es un fichero o un directorio, la fecha
     * de modificación, si es oculto y su tamaño (sólo ficheros).
     * En lugar de el 3 he modificado el 2, ya que solo tenía que añadir si era oculto o no.
     */

    public static File[] getPropertiesAndDirectoryContent(String path) {
        File[] files = getDirectoryContent (path);
        SimpleDateFormat dateFormat = new SimpleDateFormat ("dd-MM-yyyy HH:mm:ss");
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            System.out.println (String.format ("%s (%s) - %s - %s - %d",
                    file.getName ( ),
                    file.isDirectory ( ) ? "Directory" : "File",
                    dateFormat.format (file.lastModified ( )),
                    getisHidenString (file),
                    file.length ( )));
        }
        return files;
    }

    /**
     * Método que comprueba y devuelve un String introducido por teclado por el
     * Usuario que debe ser un directorio.
     *
     * @return
     */
    public static String getDirectoryName() throws IOException{
        File directory = null;
        var path = "";
        do {
            System.out.println (PADCSTRING);
            path = sc.nextLine ( );
            directory = new File (path);
        } while (!directory.exists () || !directory.createNewFile ());
        return path;
    }


    /**
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
 * Realiza un programa para crear un fichero de texto que contenga las cadenas de
 * caracteres suministradas desde la línea de comandos, una en cada línea del fichero de texto.
 */

public static File createTextFile() throws IOException {
    boolean exit = false;
    BufferedWriter output = null;
    File file = null;
    do {
        try {

            System.out.println (NAMESTRING);
            String name = sc.nextLine ( );
            do {
                file = new File (name);
                if (file.createNewFile ( )) {
                    output = new BufferedWriter (new FileWriter (file));
                    System.out.println ("Write a String down below");
                    String string = sc.nextLine ( );
                    for(int i = 0; i <name.length (); i++){
                        output.write (string.charAt (i));
                    }
                    System.out.println ("do you want to keep writing? \n--yes       --no");
                    if (sc.nextLine ( ).equals ("no")) {
                        exit = true;
                    } else {
                        System.out.println ("Ok!");
                    }

                    output.close ( );
                }
            }
                while (!exit) ;
            } catch(IllegalArgumentException | SecurityException ignored){
                System.out.println ("Something was not where it should be");

            } finally{
                if (output != null)
                    output.close ( );
            }

    } while (!exit);

    return file;
}



public static void readFile(String path){
    File file = new File (path);
    FileReader input = null;
    try {
        input = new FileReader (file);
        int c = 0;
while((c = input.read ()) != -1){
    System.out.println (c );
}
    }catch(IOException e){
        System.out.println ("The file your looking for flew away or is not drawable" );
    }finally{
        if(input != null) {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace ( );
            }
        }
    }
}
}
