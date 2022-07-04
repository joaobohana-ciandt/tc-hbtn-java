import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    public List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canalNotificacao){
        canais.add(canalNotificacao);
    }

    public void processar(Video video){
        String mensagem = video.getArquivo() + " - " + video.getFormatoVideo();
        Mensagem mensagemLog = new Mensagem(mensagem, TipoMensagem.LOG);

        for(CanalNotificacao canal : canais){
            canal.notificar(mensagemLog);
        }
    }
}
