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

    public void apresentarResumoPedido(){
        double totalProdutos = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for(ItemPedido i : itens){
            totalProdutos += i.getQuantidade() * i.getProduto().obterPrecoLiquido();
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n"
                    , i.getProduto().getClass().getSimpleName(), i.getProduto().getTitulo(), i.getProduto().obterPrecoLiquido(),
                        i.getQuantidade(), i.getQuantidade() * i.getProduto().obterPrecoLiquido());
        }

        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\nTOTAL PRODUTOS: %.2f\n", (totalProdutos * percentualDesconto) / 100, totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }
}
