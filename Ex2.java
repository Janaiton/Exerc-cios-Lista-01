import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num;

        System.out.println(" Informe um valor");
        num = in.nextInt();

        num = (num * 20 / 100) + num;

        System.out.println(" Esse é o valor com 20% = " + num + ".");
    }

}
