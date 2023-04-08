
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double hora;
        double horasMes;
        double totalMes;

        Scanner teclado = new Scanner(System.in);

        System.out.println("ganho por hora");
        hora = teclado.nextDouble();

        System.out.println("quantas horas mês trabalhado");
        horasMes = teclado.nextDouble();
        totalMes = horasMes * hora;

        System.out.println("meu ganho mensal é " + totalMes);
        teclado.close();
    }
}
