//Etapa 03
public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco endereco, Data dataFundacao,
                     double metaVendas, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }


    public String toString(){
     return super.toString() + "Meta vendas: " + metaVendas;
}

}
