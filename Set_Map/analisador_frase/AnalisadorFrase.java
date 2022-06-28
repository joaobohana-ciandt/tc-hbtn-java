import java.util.TreeMap;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String palavras){
        String palavrasMinuscula = palavras.toLowerCase();
        String[] palavrasSeparadas = palavrasMinuscula.split(" ");

        char[] caracteresEspeciais = {',', '.', '?', '!'};
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String p : palavrasSeparadas){
            p = p.replaceAll("[,.?!]", "");

            if(p == "?" || p == "." || p == "!"){
                continue;
            } else {
                if(map.containsKey(p)){
                    Integer numeroOcorrencia = map.get(p);
                    map.put(p, ++numeroOcorrencia);
                } else {
                    map.put(p, 1);
                }
            }
        }

        return map;
    }
}
