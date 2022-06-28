import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] array){
        HashSet<Integer> numerosUnicos = new HashSet<>();
        HashSet<Integer> numerosDuplicados = new HashSet<>();
        for(int i : array){
            if(numerosUnicos.contains(i)){
                numerosDuplicados.add(i);
            } else {
                numerosUnicos.add(i);
            }
        }

        TreeSet<Integer> numerosDuplicadosOrdenados = new TreeSet<>();
        for(Integer i : numerosDuplicados){
            numerosDuplicadosOrdenados.add(i);
        }

        return numerosDuplicadosOrdenados;
    }
}
