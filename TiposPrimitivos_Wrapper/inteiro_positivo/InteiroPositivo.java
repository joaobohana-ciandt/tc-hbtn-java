import java.util.ArrayList;

public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(Integer valor) {
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {
        if(valor.contains(",") || valor.contains(".") || (Integer.valueOf(valor) < 0)) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }

        this.valor = Integer.valueOf(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor < 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }

        this.valor = valor;
    }

    public boolean ehPrimo() {
        ArrayList<Integer> divisores = new ArrayList<>();
        for(int i = 1; i <= valor; i++){
            if(valor % i == 0){
                divisores.add(i);
            }
        }

        if(divisores.size() == 2 && (divisores.get(0) == 1) && (divisores.get(1) == valor) ){
            return true;
        }

        return false;
    }
}
