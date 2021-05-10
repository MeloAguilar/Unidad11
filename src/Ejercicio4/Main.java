package Ejercicio4;

import java.io.*;
import java.util.Scanner;

import static Clases.DirectoriesAndFiles.NAMESTRING;

/**
 * 4-
 * Realiza un programa para crear un fichero de texto que contenga las cadenas de
 * caracteres suministradas desde la línea de comandos, una en cada línea del fichero de texto.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File file = createAndWriteFile(sc);
            System.out.println(txtReader(file));
        } catch (IOException e) {
            System.out.println("Ha pasao algo con la entrada o la salida");
        }
    }


    /**
     * @return
     * @throws IOException
     */
    public static File createAndWriteFile(Scanner sc) throws IOException {
        boolean exit = false;
        BufferedWriter output = null;
        File file = null;
        while (!exit) {
            try {
                System.out.println(NAMESTRING);
                String name = sc.nextLine();
                //Se valida que sea .txt
                if (name.endsWith(".txt")) {
                    file = new File(name);
                    //Se crea el escritor
                    output = new BufferedWriter(new FileWriter(file));
                    do {
                        //mientras que no se active el booleano se pedirá al usuario que escriba
                        System.out.println("Write a String down below");
                        String string = sc.nextLine();
                        output.write(string);
                        System.out.println("do you want to keep writing? \n--yes       --no");
                        //Mientras que se seleccione si, se pedirá que siga escribiendo
                        if (sc.nextLine().equals("no")) {
                            exit = true;
                        } else {
                            System.out.println("Ok!");
                            output.newLine();
                        }
                    }
                    while (!exit);
                }
            } catch (IllegalArgumentException | SecurityException e) {
                System.out.println("Something was not where it should be");
            } finally {
                assert output != null;
                System.out.println("Lo que tu quieras");
                output.close();
            }
        }
        return file;
    }

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
            FileReader buffer = new FileReader(file);//Creamos el lector de caracteres
            input = new BufferedReader(buffer);//Creamos el lector de Strings
            while ((madreMia = input.readLine()) != null) {//mientras que la linea de Strings que lee input no sea null
                loco += madreMia + "\n";
            }//end while
            input.close();
        }//End try
        catch (IOException e) {
            System.out.println("Can´t open the file");
        }
        return loco;
    }


}
