import java.io.Serializable;
import java.util.ArrayList;
//inserindo a classe tipo despesas.
public class TipoDespesa implements Serializable {
    private ArrayList<String> tiposDespesa;
    //Criando a lista com os tipos de despesas inseridas pelo ususario.
    public TipoDespesa() {
        tiposDespesa = new ArrayList<>();
    }
    //Adicionando tipo de despesa.
    public void adicionarTipo(String tipo) {
        tiposDespesa.add(tipo);
    }
    //Listandop tipos de despesas ja cadastradas.
    public void listarTipos() {
        for (String tipo : tiposDespesa) {
            System.out.println(tipo);
        }
    }
    //Removendo tipos de despesas disponiveis.
    public void removerTipo(String tipo) {
        tiposDespesa.remove(tipo);
    }
}
