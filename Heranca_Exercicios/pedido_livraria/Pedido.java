public class Pedido {
    private double percentualDesconto;
    private ItemPedido itens[];

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double total = 0;

        for(ItemPedido i : itens){
            total += i.getProduto().obterPrecoLiquido() * i.getQuantidade();
        }

        return total - (total * percentualDesconto / 100);
    }
}
