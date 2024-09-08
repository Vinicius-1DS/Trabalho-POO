import java.io.Serializable;
//Criando as variaveis necessarias para a parte de despesas.
public class Despesa implements Serializable {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private String categoria;
    private boolean paga;
    //Usando o this para referir-se à variável de instância e diferenciar ela de parametros.
    public Despesa(String descricao, double valor, String dataVencimento, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.categoria = categoria;
        this.paga = false;
    }
    //Anotando pagamento e mudando a variavel booleana de False para true.
    public void anotarPagamento() {
        this.paga = true;
    }
    //Retornando a descrição quando a mesmo é requerido.
    public String getDescricao() {
        return descricao;
    }
    //Retornando o valor quando o mesmo é requerido.
    public double getValor() {
        return valor;
    }
    //Retornando vencimento quando o mesmo é requerido.
    public String getDataVencimento() {
        return dataVencimento;
    }
    //Retornando a categoria quando a mesmo é requerido.
    public String getCategoria() {
        return categoria;
    }
    //Verificando se a conta esta ou não paga.
    public boolean isPaga() {
        return paga;
    }
    //Declarando a forma desejada em que deve ser exibido as Informaçoes coletadas.
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
