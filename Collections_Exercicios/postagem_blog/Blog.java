import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) throws Exception {
        for(Post p: posts){
            if(p.getAutor() == post.getAutor() && p.getTitulo() == post.getTitulo()){
                throw new Exception("Postagem jah existente");
            }
        }
        posts.add(post);
    }

    public Set<Autor> obterTodosAutores(){
        Set<Autor> autores = new TreeSet<>();
        for(Post p : posts){
            if(!autores.contains(p.getAutor())){
                autores.add(p.getAutor());
            }
        }

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> categoriasContagem = new TreeMap<>();

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

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> postsAutor = new TreeSet<>();
        for(Post p: posts){
            if(p.getAutor().compareTo(autor) == 0){
                postsAutor.add(p);
            }
        }

        return postsAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> categoriasPost = new TreeSet<>();

        for(Post p: posts){
            if(p.getCategoria() == categoria){
                categoriasPost.add(p);
            }
        }

        return categoriasPost;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> categoriasPost = new TreeMap<>();

        for(Post p: posts){
            if(categoriasPost.containsKey(p.getCategoria())){
                categoriasPost.get(p.getCategoria()).add(p);
            } else {
                TreeSet<Post> posts = new TreeSet<>();
                posts.add(p);
                categoriasPost.put(p.getCategoria(), posts);
            }
        }

        return categoriasPost;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> categoriasPost = new TreeMap<>();

        for(Post p: posts){
            if(categoriasPost.containsKey(p.getAutor())){
                categoriasPost.get(p.getAutor()).add(p);
            } else {
                HashSet<Post> posts = new HashSet<>();
                posts.add(p);
                categoriasPost.put(p.getAutor(), posts);
            }
        }

        return categoriasPost;
    }
}
