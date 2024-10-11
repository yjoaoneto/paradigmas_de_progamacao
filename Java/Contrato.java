public class Contrato implements Interface_Texto{

    private String assinante;
    private double valor_contrato;

    public Contrato(String assinante,double valor_contrato){
        this.assinante = assinante;
        this.valor_contrato = valor_contrato;
    }

    @Override
    public void mostrarTexto() {
        System.out.println("Assinante do contrato: "+this.assinante);
        System.out.println("Valor do contrato: "+this.assinante);
    }
}
