import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor > 0){
            this.saldo += valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException{
        if(valor > 0){
            if(this.saldo - valor >= 0){
                this.saldo -= valor;
            } else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
    }

    public double calcularTarifaMensal(){
        double tarifaSaldo = this.saldo * 0.1;
        if(tarifaSaldo < 10){
            return tarifaSaldo;
        }

        return 10;
    }

    public double calcularJurosMensal(){
        if(this.saldo > 0){
            double taxaDeJurosReal = (taxaJurosAnual / 100);
            return (this.saldo * taxaDeJurosReal) / 12;
        }

        return 0;
    }

    public void aplicarAtualizacaoMensal(){
        double juros = calcularJurosMensal();
        double tarifa = calcularTarifaMensal();
        this.saldo += juros;
        this.saldo -= tarifa;

    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }
}
