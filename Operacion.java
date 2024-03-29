import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    // Método constructor con todos los atributos pasados por parámetro
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método constructor sin los atributos pasados por parámetro
    public Operacion() {
        // Este constructor está vacío, los valores se asignarán con los métodos set
    }

    // Métodos get y set
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Método para crearOperacion
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        this.numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        this.numero2 = scanner.nextDouble();
    }

    // Método sumar
    public double sumar() {
        return numero1 + numero2;
    }

    // Método restar
    public double restar() {
        return numero1 - numero2;
    }

    // Método multiplicar 
    public double multiplicar() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    // Método dividir 
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}
