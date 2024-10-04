import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float base, altura, area;

        System.out.println(" Informe as dimensões do triângulo");
        System.out.print(" Base = ");
        base = in.nextInt();
        System.out.print(" Altura = ");
        altura = in.nextInt();

        area = (base * altura) / 2;

        System.out.println(" A area total do triangulo é = " + area + " m² ");

    }

}
