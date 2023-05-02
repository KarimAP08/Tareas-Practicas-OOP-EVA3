/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author Karim
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARITHMETIC EXCEPTION: DIVISION ENTRE CERO
        System.out.println("Iniciando programa");
        System.out.println("Declarando variables");
        int x = 5, y = 0;
        System.out.println("intentar la division");
        int resu = x / y; //Aqui se genera la excepcion
        //Si no se atiende, el programa termina
        System.out.println("Resultado: " + resu);// ya no se ejecuta

        //INPUTMISMATCH EXCEPTION
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int nume = input.nextInt(); // si el usuario captura una cadena que no puede convertirse
        // a numero, se produce una excepcion termina el programa 
        System.out.println("El numero es: " + nume);

        //ARRAYINDEXOUTOFBOUNDS EXCEPTIONS
        int[] arreglo = new int[5];//arreglo 5 posiciones
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;//<--? no es un indice valido,
        //el arreglo va de 0 a 4

        //NULLPOINTER EXCEPTION
        prueba objprueba = null; // el objeto no existe, es nulo
        System.out.println("El valor de x: " + objprueba.x);// no se puede leer la x, porque el objeto
        //no existe
    }

}

class prueba {

    int x = 100;
}
