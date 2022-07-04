import atividades.Atividade;

import java.util.List;

public class MaquinaWorkflow {
    public void executar(Workflow workflow){
        List<Atividade> atividadesWorkflow = workflow.getAtividades();
        for(Atividade a : atividadesWorkflow){
            a.executar();
        }
    }
}
