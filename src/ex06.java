import java.util.Scanner;

public class ex06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("        Opções de curso\n       Java(1)\n       Banco de dados(2)\n     Desenvolvimentos web(3)\n       Redes(4)");
        IO.println("        Escolha:");
        int escolha= sc.nextInt();
        switch (escolha){
            case 1:
                IO.println("        O java é uma linguagem de backend da programação ");
                break;
            case 2:
                IO.println("        Você como fazer um banco de dados ");
                break;
            case 3:
                IO.println("        Você aprenderá a fazer desenvolvimento web");
                break;
            case 4:
                IO.println("        Você aprendera sobre protocolos ip, como funciona a parte fisica e logica das comunicações de dispositivos ");
                break;
            default:
                IO.println("Opção inválida!");
        }
    }
}
