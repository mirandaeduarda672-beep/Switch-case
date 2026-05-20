import java.util.Scanner;

public class ex02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("        Escreva o primeiro numero");
        IO.println("Resposta:");
        double numero1 = sc.nextInt();
        IO.println("        Escreva o Segundo numero");
        IO.println("Resposta:");
        double numero2 = sc.nextInt();

        IO.println("        Qual operação você deseja utilizar?\nAdição(1)\nSubtração(2)\nMultiplicação(3)\nDivisão(4)");
        int escolha = sc.nextInt();
        double conta = 0;
        switch (escolha) {
            case 1:
                conta = numero1 + numero2;
                IO.println(numero1 + "+" + numero2 + "=" + conta);
                break;
            case 2:
                conta = numero1 - numero2;
                IO.println(numero1 + "-" + numero2 + "=" + conta);
                break;
            case 3:
                conta = numero1 * numero2;
                IO.println(numero1 + "*" + numero2 + "=" + conta);
                break;
            case 4:
                conta = numero1 / numero2;
                IO.println(numero1 + "/" + numero2 + "=" + conta);
                break;
            default:
                IO.println("        Opção invalida infeliz");
        }

    }
}
