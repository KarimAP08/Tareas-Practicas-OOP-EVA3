/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author Karim
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DatoIncorrectoCheckEx {
        // TODO code application logic here
        persona per = new persona();
        per.setNombre("Mario");
        per.setApellido("Almidon");
        try {
            per.setEdad(-10);
        } catch (DatoIncorrectoCheckEx e) {
            System.out.println(e.getMessage());
        }
    }

}

class persona {

    private String Nombre;
    private String Apellido;
    private int Edad;

    public persona() throws DatoIncorrectoCheckEx {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        setEdad(Edad);
    }

    public persona(String Nombre, String Apellido, int Edad) {
        this.Nombre = "";
        this.Apellido = "";
        this.Edad = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) throws DatoIncorrectoCheckEx {
        if (Edad < 0) {
           // throw new DatoIncorrectoExcepction();//UNCHECKED EXCEPTION
           throw new DatoIncorrectoCheckEx();//CHECKED EXCEPTION
        }
        this.Edad = Edad;
    }

}

class DatoIncorrectoExcepction extends RuntimeException {

    public DatoIncorrectoExcepction() {
        super("Dato incorrecto!! el valor introducido no puede ser negativo");
    }

}

class DatoIncorrectoCheckEx extends Exception {

    public DatoIncorrectoCheckEx() {
        super("Dato incorrecto!! el valor introducido no puede ser negativo");
    }

}
