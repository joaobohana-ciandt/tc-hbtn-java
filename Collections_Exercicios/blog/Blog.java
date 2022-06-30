import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post){
        posts.add(post);
    }

    public Set<String> obterTodosAutores(){
        TreeSet<String> autores = new TreeSet<>();
        for(Post p : posts){
            autores.add(p.getAutor());
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        TreeMap<String, Integer> categoriasContagem = new TreeMap<>();

        for(Post p : posts){
            if(categoriasContagem.containsKey(p.getCategoria())) {
                Integer count = categoriasContagem.get(p.getCategoria());
                count++;
                categoriasContagem.put(p.getCategoria(), count);
            } else {
                categoriasContagem.put(p.getCategoria(), 1);
            }
        }

        return categoriasContagem;
    }
}
