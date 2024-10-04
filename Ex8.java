import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double eleitores, vValidos, vBranco, vNulos;
        double pValidos, pBranco, pNulos;

        System.out.println(" Informe os dados da eleição!");
        System.out.print(" Eleitores = ");
        eleitores = in.nextDouble();
        System.out.print(" Votos validos = ");
        vValidos = in.nextDouble();
        System.out.print(" Votos em branco = ");
        vBranco = in.nextDouble();
        System.out.print(" Votos nulos = ");
        vNulos = in.nextDouble();

        pValidos = (vValidos / eleitores) * 100;
        pBranco = (vBranco / eleitores) * 100;
        pNulos = (vNulos / eleitores) * 100;

        System.out.println(" Percentual de validos = " + pValidos + "%");
        System.out.println(" Percentual de votos em branco = " + pBranco + "%");
        System.out.println(" Percentual de votos nulos = " + pNulos + "%");
    }

}
