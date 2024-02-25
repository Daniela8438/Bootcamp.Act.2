import java.util.Scanner;
//Creando cuenta
public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    // Constructor por defecto
    public Cuenta() {
    }

    // Constructor con DNI, saldo, número de cuenta e interés
    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    // Métodos getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    // Método para crear un objeto Cuenta, pidiéndole los datos al usuario
    public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de cuenta:");
        this.numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        this.dniCliente = scanner.nextLong();
        System.out.println("Ingrese el saldo actual:");
        this.saldoActual = scanner.nextDouble();
    }

    // Método ingresar(double ingreso)
    public void ingresar(double ingreso) {
        this.saldoActual += ingreso;
    }

    // Método retirar(double retiro)
    public void retirar(double retiro) {
        if (this.saldoActual >= retiro) {
            this.saldoActual -= retiro;
        } else {
            this.saldoActual = 0;
        }
    }

    // Método extraccionRapida
    public void extraccionRapida() {
        double cantidadARetirar = this.saldoActual * 0.20;
        this.retirar(cantidadARetirar);
    }

    // Método consultarSaldo
    public double consultarSaldo() {
        return this.saldoActual;
    }

    // Método consultarDatos
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("DNI del cliente: " + this.dniCliente);
        System.out.println("Saldo actual: " + this.saldoActual);
    }
}
