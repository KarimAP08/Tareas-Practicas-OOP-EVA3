/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karim
 */
public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prueba pr = new prueba();
        do {
            try {
                Scanner x = new Scanner(System.in);
                System.out.println("Introduzca un numero: ");
                pr.setValor(x.nextInt());
                break;
            } catch (Exception ex) {// Es la superclase de todas las excepciones por tanto
                // captura las excepciones
                //complica detectar el tipo de excepcion, y dar la solucion correcta
                System.out.println(ex.getMessage());
            }
            //obj no existe fuera del bloque try, porque ahi fue declarado

        } while (true);

    }

}

class prueba {

    private int valor;

    public int getValor() {
        return valor;
    }

    //checjed exceptions: se deben resolver en tiempo // compilacion
    //unchecked exceptions: errores de logica, del programador
    // Java no te obliga a resolverlas
    public void setValor(int valor) throws Exception {
        if (valor < 0) {
            //EXCEPTION ES DEL TIPO "CHECKED EXPECTION"
            throw new Exception("El valor " + valor + " es invalido. Debe ser mayor o igual a 0");
        } else {
            this.valor = valor;
        }
    }

}
