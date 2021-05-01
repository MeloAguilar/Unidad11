package Main;

import Clases.DirectoriesAndFiles;

import java.io.File;
import java.io.IOException;

public class Main {
    public static final String DIRECTORY_NAME = "D:\\GSDAM\\Programación";
    public static void main(String[] args) {
        /**
         * DirectoriesAndFiles.getPropertiesAndDirectoryContent ();
         * File[] files =  DirectoriesAndFiles.getPropertiesAndDirectoryContent (DirectoriesAndFiles.getDirectoryName ());

        try {
            File file = DirectoriesAndFiles.createTextFile ( );
        }catch (IOException e){
            System.out.println ("Noseke" );
        }
        }*/
        try {
            DirectoriesAndFiles.readFile (DirectoriesAndFiles.getDirectoryName ( ));
        }catch (IOException e){
            System.out.println ("ñaña" );
        }
        }
}
