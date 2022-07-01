import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public Cliente buscarCliente(String nomeCliente){
        Cliente cliente = null;
        for(Cliente c: clientes){
            if(c.getNome().equals(nomeCliente)){
                cliente = c;
            }
        }

        return cliente;
    }

    public boolean adicionarTransacaoCliente(String nome, double valTransacao){
        Cliente cliente = buscarCliente(nome);
        if(cliente != null){
            cliente.adicionarTransacao(valTransacao);
            return true;
        }

        return false;
    }

    public boolean novoCliente(String nome, double transacaoInicial){
        Cliente clienteExiste = buscarCliente(nome);
        if(clienteExiste == null){
            Cliente novoCliente = new Cliente(nome, transacaoInicial);
            clientes.add(novoCliente);
            return true;
        }

        return false;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
