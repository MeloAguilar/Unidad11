package Main;

import Clases.DirectoriesAndFiles;
import Clases.Ejercicio7.PropertiesAndDirectoryContent;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final String DIRECTORY_NAME = "D:\\GSDAM\\Programación";
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        File pene = new File ("D:\\GSDAM\\cosa.txt");
        PropertiesAndDirectoryContent pf = new PropertiesAndDirectoryContent (pene);
        System.out.println (pf );

        sc.close ();
        }

}

/**
 *
 * File[] files =  DirectoriesAndFiles.getPropertiesAndDirectoryContent (DirectoriesAndFiles.getDirectoryName ());

 try {
 File file = DirectoriesAndFiles.createTextFile ( );
 }catch (IOException e){
 System.out.println ("Noseke" );
 }
 }
 try {
 DirectoriesAndFiles.createTextFile ();
 }catch (IOException e){
 System.out.println ("ñaña" );

 }
 File file = DirectoriesAndFiles.createTextFile();

 try {
 System.out.println (DirectoriesAndFiles.txtReader (DirectoriesAndFiles.createTextFile ( )));
 }catch(IOException e){
 System.out.println ("Es que eres tonto?" );
 }
 */
