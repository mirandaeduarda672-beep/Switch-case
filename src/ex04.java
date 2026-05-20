import java.util.Scanner;

public class ex04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("        Escolha um numero de 1 a 12");
        IO.println("Resposta:");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                IO.println("        mês de Janeiro");
                break;
            case 2:
                IO.println("        mês de Fevereiro");
                break;
            case 3:
                IO.println("        mês de Março");
                break;
            case 4:
                IO.println("        mês de Abril");
                break;
            case 5:
                IO.println("        mês de Maio");
                break;
            case 6:
                IO.println("        mês de Junho");
                break;
            case 7:
                IO.println("        mês de Julho");
                break;
            case 8:
                IO.println("        mês de Agosto");
                break;
            case 9:
                IO.println("        mês de Setembro");
                break;
            case 10:
                IO.println("        mês de Outubro");
                break;
            case 11:
                IO.println("        mês de Novembro");
                break;
            case 12:
                IO.println("        mês de Dezembro");
                break;
            default:
                IO.println("Opção inválida");


        }

    }
}
