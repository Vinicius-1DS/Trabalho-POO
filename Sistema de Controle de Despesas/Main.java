import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Criação da Nova classe Herdada De Sistemadespesa: "sistema" 
        SistemaDespesa sistema = new SistemaDespesa();
//Componentes do Menu Principal
        while (true) {
            System.out.println("Menu Principal:");
            System.out.println("1. Inserir Despesa");
            System.out.println("2. Anotar Pagamento");
            System.out.println("3. Listar Despesas em Aberto");
            System.out.println("4. Listar Despesas Pagas");
            System.out.println("5. Gerenciar Tipos de Despesa");
            System.out.println("6. Gerenciar Usuários");
            System.out.println("7. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
//Definindo Qual das classes o programa deve Usar Dependendo do comando Inserido pelo Usuário.
            switch (opcao) {
                case 1:
                    sistema.entrarDespesa(scanner);
                    break;
                case 2:
                    sistema.anotarPagamento(scanner);
                    break;
                case 3:
                    sistema.listarDespesas(false);
                    break;
                case 4:
                    sistema.listarDespesas(true);
                    break;
                case 5:
                    sistema.gerenciarTiposDespesa(scanner);
                    break;
                case 6:
                    sistema.gerenciarUsuarios(scanner);
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Essa Opção é inválida. Tente novamente.");
            }
        }
    }
}
