import java.util.*;

public class ConsultaProdutos {
    public static ArrayList<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){
        ArrayList<Produto> produtosFiltrados = new ArrayList<>();
        produtos.forEach(produto -> {
            boolean isValido = criterioFiltro.testar(produto);
            if(isValido) produtosFiltrados.add(produto);
        });

        return produtosFiltrados;
    }
}
