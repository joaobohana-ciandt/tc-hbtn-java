public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) throws Exception {
        modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao) throws Exception {
        if(descricao != null && !descricao.isEmpty() && !descricao.isBlank()){
            setDescricao(descricao);
        } else {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }
}
