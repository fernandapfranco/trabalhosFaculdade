import java.util.Scanner;
//Etapa 02
public class Principal {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    loja = criarLoja(scanner);
                    System.out.println("Loja criada com sucesso: " + loja);
                    System.out.println(loja.toString());
                    break;
                case 2:
                    produto = criarProduto(scanner);
                    System.out.println("Produto criado com sucesso: " + produto);
                    System.out.println(produto.toString());

                    Data dataReferencia = new Data(20, 10, 2023);
                    if (produto.estaVencido(dataReferencia)) {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    } else {
                        System.out.println("PRODUTO VENCIDO");
                    }
                    break;
                case 3:
                    System.out.println("Finalizando");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao !=3);
    scanner.close();
    }

    private static Loja criarLoja(Scanner scanner){
        System.out.println("Cadastrar nova loja:");
        System.out.println("Nome loja:");
        String nome = scanner.next();
        System.out.println("Quantidade de funcionários:");
        int quantidadeFuncionarios = scanner.nextInt();
        System.out.println("Salário base dos funcionários:");
        double salarioBaseFuncionarios = scanner.nextDouble();
        System.out.println("Digite a quantidade máxima de produtos:");
        int quantidadeMaximaProdutos = scanner.nextInt();

        Endereco endereco = criarEndereco(scanner);

        Data dataFundacao = criarData(scanner);

        return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
    }

    private static Produto criarProduto(Scanner scanner){
        System.out.println("Cadastrar novo produto:");
        System.out.println("Nome produto:");
        String nome = scanner.next();
        System.out.println("Preço produto");
        double preco = scanner.nextDouble();

        Data dataValidade = criarData(scanner);

        return new Produto(nome, preco, dataValidade);
    }

    private static Endereco criarEndereco(Scanner scanner){
        System.out.println("Cadastrar endereço:");
        System.out.print("Nome rua: ");
        String nomeDaRua = scanner.next();
        System.out.print("Cidade: ");
        String cidade = scanner.next();
        System.out.print("Estado: ");
        String estado = scanner.next();
        System.out.print("País: ");
        String pais = scanner.next();
        System.out.print("CEP: ");
        String cep = scanner.next();
        System.out.print("Número: ");
        String numero = scanner.next();
        System.out.print("Complemento: ");
        String complemento = scanner.next();

        return new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
    }

    private static Data criarData(Scanner scanner){
        System.out.println("Informar data:");
        System.out.println("Dia: ");
        int dia = scanner.nextInt();
        System.out.println("Mês: ");
        int mes = scanner.nextInt();
        System.out.println("Ano: ");
        int ano = scanner.nextInt();

        return  new Data(dia, mes, ano);
    }
}
