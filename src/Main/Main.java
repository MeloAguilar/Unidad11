package Main;

import Clases.DirectoriesAndFiles;

import java.io.File;
import java.io.IOException;

public class Main {
    public static final String DIRECTORY_NAME = "D:\\GSDAM\\Programación";
    public static void main(String[] args) {
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
         */

            System.out.println(DirectoriesAndFiles.txtReader(new File("C:\\Users\\caguilar\\Desktop\\pruebita.txt")));

        }
}
