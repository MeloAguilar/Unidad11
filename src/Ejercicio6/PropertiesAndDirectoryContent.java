package Ejercicio6;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Diseña un programa con contraseña, que será suministrada desde la línea de
 * comandos junto con la ruta de un archivo de texto. Del archivo debes corregir las palabras que
 * deben empezar por mayúsculas.
 */

public class PropertiesAndDirectoryContent {


    private File file;
    private String name;
    private boolean isDirectory;
    private LocalDate lastModified;
    private long fileLegth;
    private boolean isHidden;


    public PropertiesAndDirectoryContent(File file) {
        this.file = file;
        this.name = file.getName ();
        this.isDirectory = file.isDirectory ();
        this.isHidden = file.isHidden ();
        this.fileLegth = file.length ();
        this.lastModified = getLastModified (getStringLastModified (file));
    }

    /**
     * 3-
     * - Modifica el ejercicio anterior devolviendo un array de objetos que contengan el
     * nombre de un fichero o carpeta dentro de la ruta recibida, si es un fichero o un directorio, la fecha
     * de modificación, si es oculto y su tamaño (sólo ficheros).
     */

    private static String getStringLastModified(File file){
        //Declaras el formato de String
        SimpleDateFormat dateFormat = new SimpleDateFormat ("dd-MM-yyyy HH:mm:ss");
        String date = dateFormat.format (file.lastModified ( ));
        //Declaras el formato del localdate
        return date;
    }

    private static LocalDate getLastModified(String string){
        //declaras Localdate
        LocalDate lpmdtm = null;
        DateTimeFormatter tpm = DateTimeFormatter.ofPattern ("dd-MM-yyyy HH:mm:ss");
        //Le das formato al string
        //Le das el string formateado al localdate con parse
        lpmdtm = LocalDate.parse (string, tpm);
        return lpmdtm;
    }

    @Override
    public String toString() {
        return String.format ("Name --> %s\nIs %s\n %s\nLast modified --> %s\nFile length --> %d",
                name, isDirectory ? "Directory" : "File", Ejercicio2.Main.getisHidenString (file), getStringLastModified (file), fileLegth);
    }
}
