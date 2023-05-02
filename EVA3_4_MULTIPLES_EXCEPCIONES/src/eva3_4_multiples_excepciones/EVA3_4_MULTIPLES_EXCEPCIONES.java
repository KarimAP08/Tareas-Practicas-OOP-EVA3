/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Karim
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce el valor de (numero entero): ");
                x = input.nextInt();
                System.out.println("Introduce el valor de (numero entero): ");
                y = input.nextInt();
                int resu = x / y;            
                System.out.println("El resultado de " + x + "/" + y + ":" + resu);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Captura en forma incorrecta, no se puede convertir a numero");
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0");
            }
            
        } while (true);
        System.out.println("programa terminado exitosamente");
        

    }

}
