import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int numCaixas = 0;
        for(int i = 0; i < cookies.size(); i++){
            numCaixas += cookies.get(i).getQuantidadeCaixas();
        }

        return numCaixas;
    }

    public int removerSabor(String sabor){
        int numCaixasRemovidas = 0;
        for(int i = 0; i < cookies.size(); i++){
            if(cookies.get(i).getSabor().equals(sabor)){
                numCaixasRemovidas += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
            }
        }

        return numCaixasRemovidas;
    }
}
