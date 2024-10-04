import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int temperatura;

        System.out.print(" Informe a temperatura em Fahrenheit = ");
        temperatura = in.nextInt();

        temperatura = (temperatura - 32) * 5 / 9;

        System.out.println(" Essa temperatura em Celsus é = " + temperatura);
    }

}
