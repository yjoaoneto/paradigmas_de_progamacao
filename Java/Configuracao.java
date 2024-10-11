public class Configuracao {

    private static Configuracao instancia;


    private Configuracao() {
        System.out.println("Instância da configuração criada.");
    }


    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }


    public void mostrarConfiguracao() {
        System.out.println("Mostrar na tela as configurações do sistema.");
    }
}