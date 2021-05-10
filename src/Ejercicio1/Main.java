package Ejercicio1;

import java.io.File;
import java.util.Arrays;

public class Main {
    /**
     * 1-
     * Haz un subprograma que liste el contenido del directorio actual, usando File
     * <p>
     * Precondiciones: path debe ser una ruta validada
     */
    public static void main(String[]args){

       getDirectoryContent(".");

    }

    public static File[] getDirectoryContent(String path) {
        File directoryFiles = new File (path);
        File[] files = null;
        if (directoryFiles.exists ( )) {
            files = directoryFiles.listFiles ( );
            for(int i = 0; i < files.length; i++){
                if(files[i].isDirectory()){
                    System.out.println(Arrays.toString(getDirectoryContent(files[i].getPath())));
                }
            }
        } else {
            System.out.println ("The directory you're looking for does not exist...");
        }
        return files;
    }
}
