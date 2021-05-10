package Ejercicio6;

import Clases.DirectoriesAndFiles;
import Clases.Ejercicio8.Ejercicio8;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        File[] files = Ejercicio1.Main.getDirectoryContent(Ejercicio2.Main.getDirectoryName(sc));
        for(File file: files){

        }
    }
}
