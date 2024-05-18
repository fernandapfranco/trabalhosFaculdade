//Etapa 03
public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco endereco, Data dataFundacao,
                     boolean produtosImportados, int quantidadeMaximaProdutos){
            super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
            this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString(){
        return super.toString() + "Produtos Importados: " + produtosImportados;
    }
}
