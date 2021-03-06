import java.util.Objects;

public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + codigoArea + ") " + numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoArea);
    }

    @Override
    public boolean equals(Object obj) {
        Telefone telefone = (Telefone) obj;
        if(Objects.equals(this.codigoArea, telefone.codigoArea) && Objects.equals(this.numero, telefone.numero)){
            return true;
        }

        return false;
    }
}
