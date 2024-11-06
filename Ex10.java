import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Dados de entrada:

        // valor de cada ingresso
        // numero de socios com desconto
        // não pagantes menores de 10 anos

        // Deverá mostrar:

        // exibir o público total do evento
        // renda total do evento
        // valor que deixou de ser arrecadada devido aos descontos e isenções

        int ingresso, socios, comum, criancas, rendaTotal;
        int totalSocios, descontoSocios, publicoTotal, totalComum, totalCriancas, totalDescontos;

        System.out.println(" Lance as informações ");
        System.out.print(" Valor do ingresso = ");
        ingresso = in.nextInt();
        System.out.print(" Total de socios = ");
        socios = in.nextInt();
        System.out.print(" Quantidade de crianças = ");
        criancas = in.nextInt();
        System.out.print(" Total de ingressos comuns = ");
        comum = in.nextInt();

        totalSocios = (ingresso * 70 / 100) * socios;
        descontoSocios = (ingresso * 30 / 100) * socios;
        publicoTotal = socios + criancas + comum;
        totalComum = comum * ingresso;
        totalCriancas = criancas * ingresso;
        totalDescontos = totalCriancas + descontoSocios;
        rendaTotal = totalSocios + totalComum;

        System.out.println(" Publico total = " + publicoTotal + " pessoas ");
        System.out.println(" Renda total de = R$ " + rendaTotal + " reais ");
        System.out.println(" Deixou de arrecadar = R$ " + totalDescontos + " reais ");
        System.out.println(" Desconto dos socios = R$ " + descontoSocios + " reais ");
        System.out.println(" Total arrecadado com os sócios = R$ " + totalSocios + " reais ");
    }

}
