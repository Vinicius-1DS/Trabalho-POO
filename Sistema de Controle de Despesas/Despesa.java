import java.io.Serializable;

public class Despesa implements Serializable {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private String categoria;
    private boolean paga;

    public Despesa(String descricao, double valor, String dataVencimento, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.categoria = categoria;
        this.paga = false;
    }

    public void anotarPagamento() {
        this.paga = true;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isPaga() {
        return paga;
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "Descricao='" + descricao + '\'' +
                ", Valor=" + valor +
                ", Data de Vencimento='" + dataVencimento + '\'' +
                ", Categoria='" + categoria + '\'' +
                ",Paga=" + paga +
                '}';
    }

}
