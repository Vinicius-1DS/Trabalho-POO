import java.util.ArrayList;
import java.util.Scanner;
//Criando a Classe sistemas despesas que sera usada seus prametros posterioe=rmente no proprio metodo main.
//Criando as listas necessarias.
public class SistemaDespesa {
    private ArrayList<Despesa> despesas;
    private TipoDespesa tipoDespesa;
    private ArrayList<Usuario> usuarios;
    //Declarando variaveis.
    public SistemaDespesa() {
        despesas = new ArrayList<>();
        tipoDespesa = new TipoDespesa();
        usuarios = new ArrayList<>();
    }
    //Criando o menu de inserção de despesas.
    public void entrarDespesa(Scanner scanner) {
        System.out.println("Digite a descrição da despesa:");
        String descricao = scanner.nextLine();
        System.out.println("Digite o valor da despesa:");
        double valor = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha
        System.out.println("Digite a data de vencimento (dd/mm/aaaa):");
        String dataVencimento = scanner.nextLine();
        System.out.println("Digite a categoria da despesa:");
        String categoria = scanner.nextLine();
        //Salvando desepesa Inserida pelo o usuario atraves do menu.
        Despesa despesa = new Despesa(descricao, valor, dataVencimento, categoria);
        despesas.add(despesa);
        System.out.println("Despesa adicionada com sucesso!");
    }
    //Criando menu para receber o nome da depsesa que dejesa ser paga e anotando o pagamento da mesma. 
    public void anotarPagamento(Scanner scanner) {
        System.out.println("Digite a descrição da despesa a ser paga:");
        String descricao = scanner.nextLine();
        for (Despesa despesa : despesas) {
            if (despesa.getDescricao().equalsIgnoreCase(descricao) && !despesa.isPaga()) {
                despesa.anotarPagamento();
                System.out.println("Pagamento registrado com sucesso!");
                return;
            }
        }
        //Caso a despesa não seja encontada.
        System.out.println("Despesa não encontrada ou já paga.");
    }
    //Listando despesas ja pagas.
    public void listarDespesas(boolean pagas) {
        for (Despesa despesa : despesas) {
            if (despesa.isPaga() == pagas) {
                System.out.println(despesa);
            }
        }
    }
    //Gerenciando os tipos de despesas disponiveis.
    public void gerenciarTiposDespesa(Scanner scanner) {
        System.out.println("Gerenciar Tipos de Despesa:");
        System.out.println("1. Adicionar Tipo");
        System.out.println("2. Listar Tipos");
        System.out.println("3. Remover Tipo");

        int opcao = scanner.nextInt();
        scanner.nextLine();  
        //Inserção da ordem em que são exigidas e guardadas as informações de novas despesas.
        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do novo tipo de despesa:");
                String tipo = scanner.nextLine();
                tipoDespesa.adicionarTipo(tipo);
                System.out.println("Tipo de despesa adicionado com sucesso!");
                break;
            case 2:
                tipoDespesa.listarTipos();
                break;
            case 3:
                System.out.println("Digite o nome do tipo de despesa a ser removido:");
                String tipoRemover = scanner.nextLine();
                tipoDespesa.removerTipo(tipoRemover);
                System.out.println("Tipo de despesa removido com sucesso!");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    //Gerenciando usuarios.
    public void gerenciarUsuarios(Scanner scanner) {
        System.out.println("Gerenciar Usuários:");
        System.out.println("1. Adicionar Usuário");
        System.out.println("2. Listar Usuários");

        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha
        //Inserção da ordem em que são exigidas e guardadas as informações de novos usuarios.
        switch (opcao) {
            case 1:
                System.out.println("Digite o login do novo usuário:");
                String login = scanner.nextLine();
                System.out.println("Digite a senha do novo usuário:");
                String senha = scanner.nextLine();
                usuarios.add(new Usuario(login, senha));
                System.out.println("Usuário adicionado com sucesso!");
                break;
            //Login de usuario cadastrado.
            case 2:
                for (Usuario usuario : usuarios) {
                    System.out.println("Login: " + usuario.getLogin());
                }
                break;
            default:
            //Caso apaertado opção inexistente.
                System.out.println("Opção inválida.");
        }
    }
}
