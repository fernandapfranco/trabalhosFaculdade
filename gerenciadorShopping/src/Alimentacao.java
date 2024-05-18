//Etapa 03
public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco endereco,
                       Data dataFundacao, Data dataAlvara, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString(){
        return super.toString() + "Data alvará: " + dataAlvara;
    }
}

