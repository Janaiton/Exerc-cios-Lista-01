import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println(" Informe as notas do aluno ");
        System.out.print(" Nota 01 = ");
        nota1 = in.nextFloat();
        System.out.print(" Nota 02 = ");
        nota2 = in.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println(" A media desse aluno é = " + media);

    }

}
