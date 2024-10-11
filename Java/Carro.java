import java.sql.SQLOutput;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public int velocidade;
    public Motor motor;

    public Carro(String marca, String modelo, int ano,Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
        this.motor = motor;
    }

    public void acelerar(int incremento){
        this.velocidade += incremento;
        System.out.println("Acelerando...Velocidade atual: "+this.velocidade +" km/h");
    }

    public void frear(int decremento){
        this.velocidade -= decremento;
        if (this.velocidade < 0) {
            this.velocidade = 0; // A velocidade não pode ser negativa
        }
        System.out.println("Freando...Velocidade atual: "+this.velocidade +" km/h");
    }

    public void mostrarVelocidade(){
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }


    public void info(){
        System.out.println("Marca do carro: "+ this.marca);
        System.out.println("Modelo do carro: "+ this.modelo);
        System.out.println("Ano do carro: "+ this.ano);
        motor.infosMotor();


    }


}

