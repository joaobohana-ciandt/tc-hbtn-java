import java.util.ArrayList;

public class Biblioteca<T extends Midia> {
    private ArrayList<T> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(T midia){
        midias.add(midia);
    }

    public ArrayList<T> obterListaMidias() {
        return midias;
    }
}
