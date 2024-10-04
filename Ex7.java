import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float distancia, velocidade, tempo;
        int hora, minuto;

        System.out.println(" Informe a distancia e velocidade média!");
        System.out.print(" Distancia = ");
        distancia = in.nextFloat();
        System.out.print(" Velocidade média = ");
        velocidade = in.nextFloat();

        tempo = distancia / velocidade;
        hora = (int) tempo;
        minuto = (int) ((tempo - hora) * 60);

        System.out.println(" O tempo de viagem é de " + hora + " horas e " + minuto + " minutos.");
    }

}
