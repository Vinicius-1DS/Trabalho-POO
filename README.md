# Trabalho-POO
# Documentação - Sistema de Controle de Despesas (SCD).
Criado com o objetivo de permitir que o usuário gerencie despesas e pagamentos, com funcionalidades que facilitam esse processo como a inserção de despesas, registro de pagamentos, listagem de despesas por seus status “pagas ou pendentes”, gerenciamento de tipos de despesas e gerenciamento de usuários. Essas informações são armazenadas localmente, o sistema foi implementado com o uso do Java e seus princípios de Orientação a Objetos, herança, interfaces, polimorfismo, e sobrecarga de métodos.
# Main.java
Essa é a classe principal do programa. Ela exibe  a interface do menu principal para o usuário e serve como o ponto de entrada do sistema.
Funções
# main(): 
Método principal que inicializa o sistema e fornece um loop para o menu de interação com o usuário. Baseado na escolha do usuário, ele delega as funções para o sistema de controle de despesas.
# Opções contidas no Menu Principal
* Entrar Despesa – Da entrada de uma nova despesa.
* Anotar Pagamento - Registra o pagamento de uma despesa já existente.
* Listar Despesas em Aberto - Mostra despesas que ainda não foram pagas.
* Listar Despesas Pagas - Exibe todas as despesas que já foram pagas.
* Gerenciar Tipos de Despesa -  Cria, edita e lista os tipos das despesas.
* Gerenciar Usuários - Permite cadastrar e listar usuários.
* Sair - Encerra o sistema como um todo.

# Despesa.java
A classe representa uma despesa que pode ser inserida pelo usuário. conténdo detalhes sobre a descrição, valor, data de vencimento, categoria, e o status de pagamento da mesma.
# Atributos Contidos 
* Descricao - string que descreve a despesa.
* Valor - valor da despesa.
* dataVencimento - Data de vencimento da despesa ("dd/mm/aaaa").
* Categoria - Categoria à qual a despesa pertence.
* Paga - booleano que indica se a despesa já foi paga ou não.
# Métodos
* Despesa(String descricao, double valor, String dataVencimento, String categoria) - Metodo Construtor que inicializa os atributos de uma despesa.
* anotarPagamento() - Marca a despesa como paga.
* getDescricao(), getValor(), getDataVencimento(), getCategoria(): Métodos "getter" para acessar os atributos da despesa inseridos posteriormente.
* isPaga() - Verifica se a despesa foi paga.
* toString() - Retorna uma representação em string da despesa.

# TipoDespesa.java
* Essa classe gerencia uma lista de tipos de despesas. Ela armazena e manipula as categorias que uma despesa pode ter.
# Atributos
* tiposDespesa - array de strings que contém diferentes tipos de despesas.
# Métodos
* TipoDespesa() - Construtor que inicializa uma lista vazia de tipos de despesas.
* adicionarTipo(String tipo) - Adiciona um novo tipo de despesa à lista.
* listarTipos() - Lista todos os tipos de despesas armazenados.
* removerTipo(String tipo) - Remove um tipo de despesa da lista.

# Usuario.java
* A classe Usuario é responsável por gerenciar informações de usuários, incluindo criptografia de senhas.
# Atributos
* Login - O nome de login do usuário.
* senhaCriptografada - A senha do usuário, armazenada de forma criptografada usando SHA-256.
# Métodos
* Usuario(String login, String senha) - Construtor que cria um novo usuário e criptografa sua senha.
* criptografarSenha(String senha) - Método privado que criptografa uma senha usando o algoritmo SHA-256.
* getLogin() - Retorna o nome de login do usuário.
* validarSenha(String senha) - Verifica se a senha fornecida corresponde à senha criptografada armazenada.

# SistemaDespesa.java
* A classe SistemaDespesa é o "controlador" que gerencia todas as funcionalidades principais do sistema, como entrada de despesas, registro de pagamentos, gerenciamento de tipos de despesas e usuários.
# Atributos
* Despesas - Um array que armazena todas as despesas inseridas.
* tipoDespesa - Um objeto da classe TipoDespesa que gerencia os tipos de despesas.
* Usuarios - Um array de usuários cadastrados.
# Métodos
* SistemaDespesa() - Construtor que inicializa as listas de despesas, tipos de despesas e usuários.
* entrarDespesa(Scanner scanner) - Lê os dados de entrada do usuário e cria uma nova despesa.
* anotarPagamento(Scanner scanner) - Procura uma despesa pela descrição e marca-a como paga.
* listarDespesas(boolean pagas) - Lista todas as despesas, filtrando por status (pagas ou pendentes).
* gerenciarTiposDespesa(Scanner scanner) - Exibe um submenu que permite adicionar, listar e remover tipos de despesas.
* gerenciarUsuarios(Scanner scanner) - Exibe um submenu que permite adicionar e listar usuários cadastrados.

Com isso em mente podemos citar algumas coisas importantes:
# Fluxo Geral do Sistema
* Menu Principal - Inicia no menu principal, onde pode escolher entre inserir despesas, registrar pagamentos, listar despesas, gerenciar tipos de despesas e gerenciar usuários.
* Entrar Despesa - Insere uma despesa com uma descrição, valor, data de vencimento e categoria.
* Anotar Pagamento - Registra o pagamento de uma despesa específica.
* Despesas - Lista as despesas filtrando por pagas ou pendentes, e o usuário pode editar ou excluir despesas (não implementado nesta versão).
* Gerenciar Tipos de Despesa - Cria, lista e remove tipos de despesas.
* Gerenciar Usuários - Cadastra novos usuários e lista os existentes. As senhas são criptografadas antes de serem armazenadas.
# Criptografia de Senhas
* A classe Usuario usa o algoritmo SHA-256 (algoritmo de hash seguro de 256 bits usado para proteção criptográfica). para criptografar senhas antes de armazená-las. Isso é feito através do método criptografarSenha(), que converte a senha em um hash irreversível. Quando o usuário tenta fazer login, a senha fornecida é comparada com o hash armazenado assim fazendo sua validação.
# Possíveis Melhorias
Dentre as possiveis melhorias que podemos apontar no programa a=em si pode-se desacaer allgumas delas como:
* Persistência de Dados - Atualmente, o sistema fo construido usando apenas variáveis em memória. Para que as informações sejam persistidas entre execuções do programa, seria necessário implementar leitura e gravação em arquivos de texto ouo um banco de dados, criando assim um sistema que pode ser usado e  escalonado para aglo ainda maior no futuro.
* Tratamento de Exceções - Para melhorar a robustez do sistema, implementado um tratamento de exceções e uma forma mais eficaz e util para lidar com erros comuns, como entrada de dados inválidos.
* Interface Gráfica - Embora a aplicação atual seja baseada apenas em linhas de comando, uma interface gráfica pode ser desenvolvida futuramente a fim de melhorar a experiência do usuário e tornar o sistema mais visual e intuitivo.
# Resumo:
* A documentação tem o objetivo de cobrir os principais aspectos do código, explicando as funcionalidades de cada classe e seus métodos para futuras manutencoes e entendimento de terceiros. podendo usar este documento como base para enetender e expandir o sistema.

