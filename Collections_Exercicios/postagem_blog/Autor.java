public class Autor implements Comparable {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public int compareTo(Object o) {
        Autor autor = (Autor) o;
        int compare = autor.getNome().compareTo(this.nome);
        if(compare < 0){
            return 1;
        } else if (compare > 0){
            return -1;
        } else {
            return 0;
        }
    }
}
