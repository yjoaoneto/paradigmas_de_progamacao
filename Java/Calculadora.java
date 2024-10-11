public class Calculadora {
    private double n1;
    private double n2;
    private double n3;

    public Calculadora(){}

    public double Somar(double n1,double n2){
        double resultado2 = (n1 + n2);
        System.out.println("A soma de dois números é: " + resultado2);
        return resultado2;
    }

    public double Somar(double n1,double n2,double n3){
        double resultado3 = (n1 + n2 + n3);
        System.out.println("A soma dos três números é de: "+ resultado3);
        return resultado3;
    }

}
