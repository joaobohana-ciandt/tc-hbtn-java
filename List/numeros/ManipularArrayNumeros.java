import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> lista, Integer numeroBusca ){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).equals(numeroBusca)){
                return i;
            }
        }

        return -1;
    }

    public static void adicionarNumero(List<Integer> lista, Integer numero) throws Exception {
        int isNumeroNaLista = buscarPosicaoNumero(lista, numero);
        if(isNumeroNaLista == -1){
            lista.add(numero);
        } else {
            throw new Exception("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> lista, Integer numero) throws Exception {
        int posicaoNumero = buscarPosicaoNumero(lista, numero);
        if(posicaoNumero != -1){
            lista.remove(posicaoNumero);
        } else {
            throw new Exception("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> lista, Integer numeroSubstituir, Integer numeroSubstituto){
        int posicaoNumero = buscarPosicaoNumero(lista, numeroSubstituir);
        if(posicaoNumero != -1){
            lista.set(posicaoNumero, numeroSubstituto);
        } else {
            lista.add(numeroSubstituto);
        }
    }
}
