import java.util.*;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicateProduto){
        ArrayList<Produto> produtosFiltrados = new ArrayList<>();
        produtos.forEach(produto -> {
            boolean isValido = predicateProduto.test(produto);
            if(isValido) produtosFiltrados.add(produto);
        });

        return produtosFiltrados;
    }
}
