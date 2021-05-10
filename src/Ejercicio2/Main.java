package Ejercicio2;

import Clases.DirectoriesAndFiles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String path = getDirectoryName(sc);

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
    public static String getDirectoryName(Scanner sc) {
        File directory = null;
        var path = "";
        try {
            do {
                System.out.println (DirectoriesAndFiles.PADCSTRING);
                path = sc.nextLine ( );
                directory = new File (path);
            } while (!directory.exists ( ) && !directory.createNewFile ( ));
        } catch (IOException | SecurityException exception) {
            System.out.println ("Noze q ha pazao rmano");
        }
        return path;
    }

    public static File[] showContent(String path) {
        File[] files = Ejercicio1.Main.getDirectoryContent (path);
        Arrays.sort (files);
        for(File file : files){
            System.out.println(file);
        }
        return files;
    }
}
