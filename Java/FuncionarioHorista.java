public class FuncionarioHorista extends Funcionario{

    private double horas;

    public FuncionarioHorista(String nome,double salario,double horas){
        super(nome,salario);
        this.horas = horas;
    }

    @Override
    public void calcularSalario() {
        double salarioBase = getSalario();

        double salarioFinal = salarioBase * horas;
        System.out.println("Salário do funcionário " + getNome() + " R$: " + salarioFinal);
    }
}
