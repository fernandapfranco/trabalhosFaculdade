//Etapa 01
public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade; //Etapa 02 - atualizado em 16/05/2024 22:11

    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String toString(){
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preço=" + preco +
                ", data Validade=" + dataValidade +
                '}';
    }

    public boolean estaVencido(Data dataAtual) {
        if (dataValidade.getAno() < dataAtual.getAno() || (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() < dataAtual.getMes())
                || (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() == dataAtual.getMes() && dataValidade.getDia() < dataAtual.getDia()))
        { return true;}
        else {
            return false;
        }
    }

}
