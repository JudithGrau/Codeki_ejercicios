import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    // Constructor con todos los atributos pasados por parámetro
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Constructor sin los atributos pasados por parámetro
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
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

    // Método para crearOperacion()
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        this.numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        this.numero2 = scanner.nextDouble();
    }

    // Método sumar()
    public double sumar() {
        return numero1 + numero2;
    }

    // Método restar()
    public double restar() {
        return numero1 - numero2;
    }

    // Método multiplicar()
    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: Multiplicación por cero.");
            return 0;
        }
        return numero1 * numero2;
    }

    // Método dividir()
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicación: " + operacion.multiplicar());
        System.out.println("División: " + operacion.dividir());
    }
}

