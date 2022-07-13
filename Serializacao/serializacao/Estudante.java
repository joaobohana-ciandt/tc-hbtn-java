import java.io.Serializable;

public class Estudante implements Serializable {
    private String nome;
    private int idade;
    private transient String senha;

    public Estudante(int idade, String nome , String senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return String.format("Estudante { nome='%s', idade='%d', senha='%s' }", nome, idade, senha);
    }
}
