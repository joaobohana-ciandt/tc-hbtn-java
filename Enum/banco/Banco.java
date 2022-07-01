import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nome){
        Agencia agencia = null;
        for(Agencia a : agencias){
            if(a.getNome().equals(nome)){
                agencia = a;
            }
        }

        return agencia;
    }

    public boolean adicionarAgencia(String nome){
        Agencia agenciaExiste = buscarAgencia(nome);
        if(agenciaExiste == null){
            Agencia novaAgencia = new Agencia(nome);
            agencias.add(novaAgencia);
            return true;
        }

        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacaoInicial){
        Agencia agenciaExiste = buscarAgencia(nomeAgencia);
        if(agenciaExiste != null){
            Cliente clienteExiste = agenciaExiste.buscarCliente(nomeCliente);
            if(clienteExiste == null){
                agenciaExiste.novoCliente(nomeCliente, transacaoInicial);
                return true;
            }

            return false;
        }

        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agenciaExiste = buscarAgencia(nomeAgencia);
        if(agenciaExiste != null){
            Cliente clienteExiste = agenciaExiste.buscarCliente(nomeCliente);
            if(clienteExiste != null){
                clienteExiste.adicionarTransacao(valorTransacao);
                return true;
            }
            return false;
        }

        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes){
        Agencia agenciaExiste = buscarAgencia(nomeAgencia);
        if(agenciaExiste != null){
            ArrayList<Cliente> clientes = agenciaExiste.getClientes();
            if(!imprimeTransacoes){
                for(int i = 0; i < clientes.size(); i++){
                    System.out.printf("Cliente: %s [%d]\n", clientes.get(i).getNome(), i + 1);
                }
            } else {
                for(int i = 0; i < clientes.size(); i++){
                    System.out.printf("Cliente: %s [%d]\n", clientes.get(i).getNome(), i + 1);
                    ArrayList<Double> transacoes = clientes.get(i).getTransacoes();
                    for(int j = 0; j < transacoes.size(); j++){
                        System.out.printf("  [%d] valor %.2f\n", j + 1, transacoes.get(j));
                    }
                }
            }
            return true;
        }

        return false;
    }

}
