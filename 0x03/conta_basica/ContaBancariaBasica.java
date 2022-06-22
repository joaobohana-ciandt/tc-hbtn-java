import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaDeJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaDeJurosAnual) {
        this.numeracao = numeracao;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
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
            double taxaDeJurosReal = (taxaDeJurosAnual / 100);
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

    public double getTaxaDeJurosAnual() {
        return taxaDeJurosAnual;
    }

    public void setTaxaDeJurosAnual(double taxaDeJurosAnual) {
        this.taxaDeJurosAnual = taxaDeJurosAnual;
    }
}
