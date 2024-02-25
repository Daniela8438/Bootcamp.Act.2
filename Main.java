public class Main {
    public static void main(String[] args) {
        // Crear un círculo con radio 5
        Circulo circulo = new Circulo(5);
        // Calcular y mostrar el área y el perímetro del círculo
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        // Crear un rectángulo con base 4 y altura 3
        Rectangulo rectangulo = new Rectangulo(4, 3);
        // Calcular y mostrar el área y el perímetro del rectángulo
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}