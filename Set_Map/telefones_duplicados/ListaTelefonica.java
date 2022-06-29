import java.lang.reflect.Array;
import java.util.*;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> lista;

    public ListaTelefonica() {
        this.lista = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) throws Exception {
        if(lista.containsKey(nome)){
            if(lista.get(nome).contains(telefone)){
                throw new Exception("Telefone jah existente para essa pessoa");
            } else {

                for(Map.Entry<String, HashSet<Telefone>> p : lista.entrySet()){
                    HashSet<Telefone> listaTelefones = p.getValue();
                    if(listaTelefones.contains(telefone)){
                        throw new Exception("Telefone jah pertence a outra pessoa");
                    }
                }
                
                lista.get(nome).add(telefone);
            }
        } else {
            lista.put(nome, new HashSet<>());
            lista.get(nome).add(telefone);
        }
    }

    public HashSet<Telefone> buscar(String nome){
        HashSet<Telefone> telefones = null;
        if(lista.containsKey(nome)){
            telefones = lista.get(nome);
        }

        return telefones;
    }
}
