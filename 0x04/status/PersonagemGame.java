public class PersonagemGame {
    private String nome;
    private int saudeAtual;
    private String status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(saudeAtual > 0){
            status = "vivo";
        } else {
            status = "morto";
        }
    }

    public void tomarDano(int quantidadeDeDano) {
        if (saudeAtual - quantidadeDeDano < 0) {
            setSaudeAtual(0);
        } else {
            setSaudeAtual(saudeAtual - quantidadeDeDano);
        }
    }

    public String getStatus() {
        return status;
    }

    public void receberCura(int quantidadeDeCura) {
        if (saudeAtual + quantidadeDeCura > 100) {
            setSaudeAtual(100);
        } else {
            setSaudeAtual(saudeAtual + quantidadeDeCura);
        }
    }

}
