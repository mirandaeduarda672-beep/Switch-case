import java.util.Scanner;

public class ex08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("        MENU");
        IO.println("        Opções:\n        Consultar saldo(1)\n        Sacar dinheiro(2)\n        Depositar dinheiro(3)\n        Sair(4)");
        IO.println("        Escolha:");
        int escolha = sc.nextInt();
        int saldof = 0;
        int saldov = 1000;

        switch (escolha) {
            case 1:
                IO.println("        Seu saldo é igual a:" + saldov);
                break;
            case 2:
                IO.println("        Você deseja sacar quantos reais?");
                int valor = sc.nextInt();
                saldov -= valor;
                saldof += valor;
                IO.println("        Quantia fisica de dinhero " + saldof);
                break;
            case 3:
                IO.println("        Você deseja depositar quantos reais?");
                valor = sc.nextInt();
                saldov += valor;
                IO.println("        Seu saldo digital é igual a:" + saldov);
                break;
            case 4:
                IO.println("        Você saiu");
                break;
            default:
                IO.println("        Opção inválida");
        }

    }
}
