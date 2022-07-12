import com.sun.source.tree.Tree;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
        Map<String, TreeSet<Pessoa>> retorno = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.toCollection(TreeSet::new)));

        TreeMap<String, TreeSet<Pessoa>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.putAll(retorno);
        return new TreeMap<>(treeMap);
    }

    public static Map<String,Long> obterContagemPessoasPorCargo(List<Pessoa> todasPessoas) {
        Map<String, Long> retorno = todasPessoas.stream().collect(groupingBy(Pessoa::getCargo, Collectors.counting()));
        return retorno;
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> todasPessoas) {
        return todasPessoas.stream().collect(groupingBy(Pessoa::getCargo, groupingBy(Pessoa::getIdade, counting())));
    }
}
