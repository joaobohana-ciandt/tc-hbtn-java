import java.util.ArrayList;

public class Biblioteca<Midia> {
    private ArrayList<Midia> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia midia){
        midias.add(midia);
    }

    public ArrayList<Midia> obterListaMidias() {
        return midias;
    }
}
