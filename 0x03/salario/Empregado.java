public class Empregado {
    private double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
            return 0.1 * salarioFixo;
        }

        return 0;
    }

    public double calcularSalarioTotal(Departamento departamento){
        if(departamento.alcancouMeta()){
            return salarioFixo + (calcularBonus(departamento));
        }

        return salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}
