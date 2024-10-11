public class Motor {
    private String estado;
    private double potencia;

    public Motor(String estado,double potencia){
        this.estado = estado;
        this.potencia = potencia;
    }

    public void infosMotor(){
        System.out.println("Motor está em "+ this.estado+" estado");
        System.out.println("Potência do motor é de: "+this.potencia);
    }


}
