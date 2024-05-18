//Etapa 01
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            valorPadraoErro();
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validaData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            valorPadraoErro();
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validaData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            valorPadraoErro();
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validaData(this.dia, this.mes, ano)) {
            this.ano = ano;
        }
        else {
            valorPadraoErro();
        }
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private void valorPadraoErro() {
        System.out.println("Data inválida. Data redefinida para 01/01/2000");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }

    private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1) {
            return false;
        }
        int[] diasPorMes = { 31, verificaAnoBissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return dia <= diasPorMes[mes - 1];
    }

}

