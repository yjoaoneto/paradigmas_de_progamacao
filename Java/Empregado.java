public class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome,String cargo,double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void infoEmpregado(){
        System.out.println("Nome do funcionário: "+ this.nome);
        System.out.println("Cargo do funcionário: "+ this.cargo);
        System.out.println("Salário do funcionário: "+ this.salario);
    }
}



