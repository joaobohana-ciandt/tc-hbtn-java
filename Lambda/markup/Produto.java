import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup;

    public Supplier<Double> precoComMarkup = () -> preco + (preco * (percentualMarkup / 100));
    public Consumer<Double> atualizarMarkup = valorNovo -> this.percentualMarkup = valorNovo;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 10.0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }
}
