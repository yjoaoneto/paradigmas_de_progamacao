public class FuncionarioAssalariado extends Funcionario{



    public FuncionarioAssalariado(String nome,double salario){
        super(nome,salario);

    }

    @Override
    public void calcularSalario() {
        double salarioNormal = getSalario();
        System.out.println("Salário do funcionário " + getNome() + " R$: " + salarioNormal);
    }

}
