import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> lista;

    public ListaTelefonica() {
        this.lista = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        if(lista.containsKey(nome)){
            lista.get(nome).add(telefone);
        } else {
            lista.put(nome, new ArrayList<>());
            lista.get(nome).add(telefone);
        }
    }

    public ArrayList<Telefone> buscar(String nome){
        ArrayList<Telefone> telefones = null;
        if(lista.containsKey(nome)){
            telefones = lista.get(nome);
        }

        return telefones;
    }
}
