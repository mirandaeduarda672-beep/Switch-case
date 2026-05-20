import java.util.Scanner;

public class ex10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("1 - Cadastrar usuário\n" +
                "2 - Listar usuários\n" +
                "3 - Atualizar usuário\n" +
                "4 - Excluir usuário\n" +
                "5 - Encerrar sistema");
        IO.println("        Escolha uma das opções:");
        int opcao= sc.nextInt();
        switch (opcao){
            case 1:
                IO.println("        Você escolheu o cadastro");
                break;
            case 2:
                IO.println("        Você escolheu listar usuários");
                break;
            case 3:
                IO.println("        Você escolheu atualizar usuários");
                break;
            case 4:
                IO.println("        Você escolheu excluir usuários");
                break;
            case 5:
                IO.println("        Você escolheu encerrar");
                break;
            default:
                IO.println("        Opção inválida");
        }
    }
}
