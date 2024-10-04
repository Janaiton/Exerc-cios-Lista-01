import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float cHomem, cMulher, cCrianca;
        float homem, mulher, crianca, carne;
        float seguranca = 0.2f;
        float total;

        System.out.println(" Informe total de pessoal por categoria");
        System.out.print(" Homens = ");
        homem = in.nextFloat();
        System.out.print(" Mulheres = ");
        mulher = in.nextFloat();
        System.out.print(" Crianças = ");
        crianca = in.nextFloat();

        cHomem = homem * 400;
        cMulher = mulher * 350;
        cCrianca = crianca * 200;
        carne = (cHomem + cMulher + cCrianca) * seguranca;
        total = cHomem + cMulher + cCrianca + carne;
        total = total / 1000;

        System.out.println(" Total para churrasco = " + total + " kilos");

    }

}
