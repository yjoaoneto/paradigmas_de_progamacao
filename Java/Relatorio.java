public class Relatorio implements Interface_Texto {
    private String conteudo;

    public Relatorio(String conteudo){
        this.conteudo = conteudo;
    }

    @Override
    public void mostrarTexto() {
        System.out.println("Conteúdo do relatório: \n"+this.conteudo);
    }
}
