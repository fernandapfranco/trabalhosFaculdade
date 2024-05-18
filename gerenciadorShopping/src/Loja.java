import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionarios;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;


    public Loja (String nome, int quantidadeFuncionarios,
                 double salarioBaseFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionarios = salarioBaseFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario2, Endereco endereco2, int quantMaxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionarios = -1;
        this.estoqueProdutos = new Produto[quantMaxProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario2,
                Endereco endereco2, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionarios = salarioBaseFuncionario2;
        this.endereco = endereco2;
        this.estoqueProdutos = new Produto[5]; // Exemplo de tamanho padrão, pode ser ajustado conforme necessário

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionarios() {
        return salarioBaseFuncionarios;
    }

    public void setSalarioBaseFuncionarios(double salarioBaseFuncionarios) {
        this.salarioBaseFuncionarios = salarioBaseFuncionarios;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionarios == -1) {
            return -1;
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionarios;
        }
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public void imprimeProdutos() {
        if (estoqueProdutos == null || estoqueProdutos.length == 0) {
            System.out.println("Não há produtos no estoque.");
        } else {
            System.out.println("Produtos da loja:");
            for (Produto produto : estoqueProdutos) {
                if (produto != null) {
                    System.out.println(produto.toString());
                }
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            Produto produto = estoqueProdutos[i];
            if (produto != null && produto.getNome().equalsIgnoreCase(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Loja{" +
                "Nome='" + nome + '\'' +
                ", Quantidade funcionários=" + quantidadeFuncionarios +
                ", Salário base funcionários=" + salarioBaseFuncionarios +
                ", Endereço=" + endereco +
                ", Data fundação=" + dataFundacao +
                ", estoqueProdutos=" + Arrays.toString(estoqueProdutos) +
                '}';
    }


}


