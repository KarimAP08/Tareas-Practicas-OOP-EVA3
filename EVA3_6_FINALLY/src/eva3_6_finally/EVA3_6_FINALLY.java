/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_finally;

/**
 *
 * @author Karim
 */
public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 0;
        try {
            int resu = x / y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Siempre me ejecuto");
        }
        System.out.println("Final de programa");
    }

}
