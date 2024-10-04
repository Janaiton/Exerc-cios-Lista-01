import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num;

        System.out.print(" Digite um numero qualquer = ");
        num = in.nextInt();

        num = num - 1;

        System.out.println(" Este é seu antecessor " + num);

    }

}