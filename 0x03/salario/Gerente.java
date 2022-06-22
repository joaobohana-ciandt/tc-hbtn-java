public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if(departamento.atingiuMeta()){
            return 0.2 * getSalarioFixo();
        }

        return 0;
    }
}
