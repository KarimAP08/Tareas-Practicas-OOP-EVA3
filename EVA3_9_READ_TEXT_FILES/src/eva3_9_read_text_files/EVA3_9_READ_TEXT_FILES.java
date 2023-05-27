/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_read_text_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karim
 */
public class EVA3_9_READ_TEXT_FILES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "C:\\Archivos\\Tangamandapio.txt";//windows
        try {
            //String ruta = "/Archivos/Tangamandapio"; //sistemas tipo unix
            readUsingFiles(ruta);//LEE EL ARCHIVO COMPLETO, PERO INEFICIENTE PARA ARCHIVOS GRANDES
            readingUsingBufferedReader(ruta);//OPCION PARA ARCHIVOS DE TEXTO
            readUsingFileReader(ruta);//COMIBINACION, BUFFERED Y FILE READER
            readUsingScanner(ruta);//ES UNA HERRAMIENTA QUE ESCANEA Y LEE LINEA POR LINEA
        } catch (IOException ex) {
            ex.printStackTrace();//imprimir excepcion
        }
    }

    /*Files--> lee todo el archivo y lo carga en la memoria
    principal (RAM). Por tanto, solo sirve con archivos pequenos
     */
    public static void readUsingFiles(String ruta) throws IOException {
        Path path = Paths.get(ruta);//recibimos la ruta en formato de texto,
        //la convertimos en formato path

        //readAllLines me regresa una lista de tipo String
        /*List<String> contenidoArch = Files.readAllLines(path);
        //System.out.println(contenidoArch.toString());
        for (int i = 0; i < contenidoArch.size(); i++) {
            System.out.println(contenidoArch.get(i));
        }*/
        byte[] arregloBytes = Files.readAllBytes(path);
        System.out.println(new String(arregloBytes));
    }

    /*
    Es la mejor opcion para leer archivos 
     */
    public static void readingUsingBufferedReader(String ruta) throws IOException {
        System.out.println("");
        System.out.println("LECTURA DE ARCHIVOS BUFFERED READER");
        File file = new File(ruta);//La ruta de nuestro archivo
        FileInputStream is = new FileInputStream(file);// Abre el archiovo
        InputStreamReader isReader = new InputStreamReader(is);// lee el archivo, como Bytes
        BufferedReader breader = new BufferedReader(isReader);// interpreta los bytes como caracteres
        String linea;
        while ((linea = breader.readLine()) != null) {// leer el archivo mientras no lleguemos al final
            System.out.println(linea);
        }
        breader.close();//cerrar el archivo
    }
 
    public static void readUsingFileReader(String ruta) throws IOException {
        System.out.println("");
        System.out.println("LEER ARCHIVOS EN FILE READER");
        File file = new File(ruta);
        FileReader filereader = new FileReader(file);
        BufferedReader breader = new BufferedReader(filereader);// interpreta los bytes como caracteres
        String linea;
        while ((linea = breader.readLine()) != null) {// leer el archivo mientras no lleguemos al final
            System.out.println(linea);
        }
        breader.close();//cerrar el archivo
        filereader.close();
    }
    
    public static void readUsingScanner(String ruta) throws IOException{
        System.out.println("");
        System.out.println("LECTURA DE ARCHIVOS USANDO SCANNER");
        Path source = Paths.get(ruta);
        Scanner scanner = new Scanner(source);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
    

}
