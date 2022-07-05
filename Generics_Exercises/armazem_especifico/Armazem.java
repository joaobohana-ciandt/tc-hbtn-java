import java.util.HashMap;
import java.util.Map;

public class Armazem<T> implements Armazenavel<T>{
    private Map<String, T> armazenaveis;

    public Armazem() {
        this.armazenaveis = new HashMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, T item) {
        armazenaveis.put(nome, item);
    }

    @Override
    public T obterDoInventario(String nome) {
        T item = null;
        if(armazenaveis.containsKey(nome)){
            item = armazenaveis.get(nome);
        }

        return item;
    }
}
