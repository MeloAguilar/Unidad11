package Clases.Ejercicio7;

import Clases.DirectoriesAndFiles;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * Diseña un programa con contraseña, que será suministrada desde la línea de
 * comandos junto con la ruta de un archivo de texto. Del archivo debes corregir las palabras que
 * deben empezar por mayúsculas.
 */

public class UpperPasswordCase {

    public static final String INTRODUCEPASS = "Introduce password";

    private String passWord;

    public UpperPasswordCase(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        String lockedPassword = "";
        for (int i = 0; i < passWord.length ( ); i++) lockedPassword += "*";
        return lockedPassword;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public static void text(){
        System.out.println (INTRODUCEPASS );
    }

    /**
     * Diseña un programa con contraseña, que será suministrada desde la línea de
     * comandos junto con la ruta de un archivo de texto. Del archivo debes corregir las palabras que
     * deben empezar por mayúsculas.
     */




    public void unlockFile(Scanner sc, int tries){
        boolean unlock = false;
        String attempt = "";
        FileWriter output = null;
        FileReader input = null;
        for (int i = 0; i < tries && !unlock; i++) {
            text ();//Muestra el String para indicar que debe introducir datos
            //se pide al usuario que introduzca el intento por teclado.
            if ((attempt = sc.nextLine ( )).equals (this.passWord)) {
                unlock = true;//Si lo que ha escrito el usuario es igual a la contraseña establecida unlock será true;
            }
        }
        if(unlock){
            String path = DirectoriesAndFiles.getDirectoryName ();
            File file = new File (path);
            try{
                int c = 0;
                input = new FileReader (file);
                BufferedReader it = new BufferedReader (input);
                output = new FileWriter ((DirectoriesAndFiles.getDirectoryName ()));
               String read = it.readLine ();
                for(int i = 0;i < read.length (); i++){

                }
            }catch(IOException e){

            }
        }
    }


}