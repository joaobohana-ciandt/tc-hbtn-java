import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String nome){
        int retorno = -1;
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equals(nome)){
                retorno = i;
            }
        }
        return retorno;
    }

    public void adicionarContato(Contato contato) throws Exception {
        int contatoExiste = obterPosicaoContato(contato.getNome());
        if(contatoExiste == -1){
            contatos.add(contato);
        } else {
            throw new Exception("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        int contatoAntigoExiste = obterPosicaoContato(contatoAntigo.getNome());
        int contatoNovoJaExiste = obterPosicaoContato(novoContato.getNome());

        if(contatoAntigoExiste == -1) {
            throw new Exception("Nao foi possivel modificar contato. Contato nao existe");
        }

        if(contatoNovoJaExiste != -1 && !(novoContato.getNome().equals(contatoAntigo.getNome()))) {
            throw new Exception("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        contatos.set(contatoAntigoExiste, novoContato);

    }

    public void removerContato(Contato contato) throws Exception {
        int contatoExiste = obterPosicaoContato(contato.getNome());

        if(contatoExiste != -1){
            contatos.remove(contatoExiste);
        } else {
            throw new Exception("Nao foi possivel remover contato. Contato nao existe");
        }
    }

    public void listarContatos(){
        for(Contato c : contatos){
            System.out.printf("%s -> %s (%s)\n", c.getNome(), c.getNumero(), c.getTipoNumero());
        }
    }

}
