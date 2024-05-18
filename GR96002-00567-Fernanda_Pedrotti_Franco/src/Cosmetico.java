//Etapa 03
public class Cosmetico extends Loja {
   private double taxaComercializacao;

public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeMaximaProdutos){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
    this.taxaComercializacao = taxaComercializacao;
}

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString(){
    return super.toString() + "Taxa de comercialização: " + taxaComercializacao;
    }
}
