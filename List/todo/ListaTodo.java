import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    public List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa novaTarefa) throws Exception {
        for(Tarefa t : tarefas){
            if(t.getIdentificador() == novaTarefa.getIdentificador()){
                throw new IllegalArgumentException("Tarefa com identificador " + t.getIdentificador() + " ja existente na lista");
            }
        }

        tarefas.add(novaTarefa);
    }

    public boolean marcarTarefaFeita(int id){
        for(Tarefa t : tarefas){
            if(t.getIdentificador() == id){
                t.setEstahFeita(true);
                return true;
            }
        }

        return false;
    }

    public boolean desfazerTarefa(int id){
        for(Tarefa t : tarefas){
            if(t.getIdentificador() == id){
                t.setEstahFeita(false);
                return true;
            }
        }

        return false;
    }

    public void desfazerTodas(){
        for(Tarefa t : tarefas){
            t.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for(Tarefa t : tarefas){
            t.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for(Tarefa t : tarefas){
            if(t.isEstahFeita()){
                System.out.print("[X]  ");
            } else {
                System.out.print("[ ]  ");
            }

            System.out.printf("Id: %d - Descricao: %s\n", t.getIdentificador(), t.getDescricao());
        }
    }
}
