import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido al menú de areas y perimetros");
        System.out.println("Selecciona la figura que desees:");
        System.out.println("1. Triangulo equilatero.");
        System.out.println("2. Circulo.");
        System.out.println("3. Cuadrado.");
        int opc = leer.nextInt();


        if(opc == 1){
            System.out.println("Haz elegido el triangulo equilatero, ahora que quieres calcular");
            System.out.println("1. Calcular area");
            System.out.println("2. Calcular perimetro");
            int opc2 = leer.nextInt();
            if (opc2 == 1){
                System.out.println("Introduce la base del triangulo");
                EquilateralTriangle triangle = new EquilateralTriangle(leer.nextFloat());
                System.out.println("Area del triangulo:" + triangle.area());

            } else if (opc2 == 2){
                System.out.println("Introduce el lado del triangulo");
                EquilateralTriangle triangle = new EquilateralTriangle(leer.nextFloat());
                System.out.println("Perimetro del triangulo:" + triangle.perimeter());
            }
        }


        if(opc == 2){
            System.out.println("Haz elegido el círculo, ahora que quieres calcular");
            System.out.println("1. Calcular area");
            System.out.println("2. Calcular perimetro");
            int opc2 = leer.nextInt();
            if (opc2 == 1){
                System.out.println("Introduce el radio del circulo");
                Circle circle = new Circle(leer.nextFloat());
                System.out.println("Area del circulo: " + circle.area());

            } else if (opc2 == 2){
                System.out.println("Introduce el radio del circulo");
                Circle circle = new Circle(leer.nextFloat());
                System.out.println("Perimetro del circulo: " + circle.perimeter());
            }
        }


        if(opc == 3){
            System.out.println("Haz elegido el cuadrado, ahora que quieres calcular");
            System.out.println("1. Calcular area");
            System.out.println("2. Calcular perimetro");
            int opc2 = leer.nextInt();
            if (opc2 == 1){
                System.out.println("Introduce el lado del cuadrado");
                Square square = new Square(leer.nextFloat());
                System.out.println("Area del cuadrado:" + square.area());
            } else if (opc2 == 2){
                System.out.println("Introduce el lado del cuadrado");
                Square square = new Square(leer.nextFloat());
                System.out.println("Perimetro del cuadrado:" + square.perimeter());
            }
        }
    }
}