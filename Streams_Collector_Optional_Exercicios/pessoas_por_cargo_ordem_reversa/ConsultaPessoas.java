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
}