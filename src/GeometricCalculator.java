import java.util.Scanner;

public class GeometricCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateCircle(scanner);
                break;
            case 2:
                calculateSquare(scanner);
                break;
            case 3:
                calculateTriangle(scanner);
                break;
            case 4:
                calculateRectangle(scanner);
                break;
            case 5:
                calculatePentagon(scanner);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }

    private static void calculateCircle(Scanner scanner) {
        System.out.println("Elija una operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");

        int operation = scanner.nextInt();
        System.out.println("Ingrese el radio:");
        double radius = scanner.nextDouble();

        if (operation == 1) {
            double area = Math.PI * radius * radius;
            System.out.println("Área del círculo: " + area);
        } else if (operation == 2) {
            double perimeter = 2 * Math.PI * radius;
            System.out.println("Perímetro del círculo: " + perimeter);
        } else {
            System.out.println("Operación no válida");
        }
    }

    private static void calculateSquare(Scanner scanner) {
        System.out.println("Elija una operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");

        int operation = scanner.nextInt();
        System.out.println("Ingrese el lado:");
        double side = scanner.nextDouble();

        if (operation == 1) {
            double area = side * side;
            System.out.println("Área del cuadrado: " + area);
        } else if (operation == 2) {
            double perimeter = 4 * side;
            System.out.println("Perímetro del cuadrado: " + perimeter);
        } else {
            System.out.println("Operación no válida");
        }
    }

    private static void calculateTriangle(Scanner scanner) {
        System.out.println("Elija una operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");

        int operation = scanner.nextInt();

        if (operation == 1) {
            System.out.println("Ingrese la base:");
            double base = scanner.nextDouble();
            System.out.println("Ingrese la altura:");
            double height = scanner.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("Área del triángulo: " + area);
        } else if (operation == 2) {
            System.out.println("Ingrese el primer lado:");
            double side1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo lado:");
            double side2 = scanner.nextDouble();
            System.out.println("Ingrese el tercer lado:");
            double side3 = scanner.nextDouble();
            double perimeter = side1 + side2 + side3;
            System.out.println("Perímetro del triángulo: " + perimeter);
        } else {
            System.out.println("Operación no válida");
        }
    }

    private static void calculateRectangle(Scanner scanner) {
        System.out.println("Elija una operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");

        int operation = scanner.nextInt();
        System.out.println("Ingrese el largo:");
        double length = scanner.nextDouble();
        System.out.println("Ingrese el ancho:");
        double width = scanner.nextDouble();

        if (operation == 1) {
            double area = length * width;
            System.out.println("Área del rectángulo: " + area);
        } else if (operation == 2) {
            double perimeter = 2 * (length + width);
            System.out.println("Perímetro del rectángulo: " + perimeter);
        } else {
            System.out.println("Operación no válida");
        }
    }

    private static void calculatePentagon(Scanner scanner) {
        System.out.println("Elija una operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");

        int operation = scanner.nextInt();
        System.out.println("Ingrese el lado:");
        double side = scanner.nextDouble();

        if (operation == 1) {
            System.out.println("Ingrese la apotema:");
            double apothem = scanner.nextDouble();
            double area = (5 * side * apothem) / 2;
            System.out.println("Área del pentágono: " + area);
        } else if (operation == 2) {
            double perimeter = 5 * side;
            System.out.println("Perímetro del pentágono: " + perimeter);
        } else {
            System.out.println("Operación no válida");
        }
    }
}
