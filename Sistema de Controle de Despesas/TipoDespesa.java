import java.io.Serializable;
import java.util.ArrayList;

public class TipoDespesa implements Serializable {
    private ArrayList<String> tiposDespesa;

    public TipoDespesa() {
        tiposDespesa = new ArrayList<>();
    }

    public void adicionarTipo(String tipo) {
        tiposDespesa.add(tipo);
    }

    public void listarTipos() {
        for (String tipo : tiposDespesa) {
            System.out.println(tipo);
        }
    }

    public void removerTipo(String tipo) {
        tiposDespesa.remove(tipo);
    }
}
