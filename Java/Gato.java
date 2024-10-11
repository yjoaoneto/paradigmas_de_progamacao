public class Gato extends Animal{

    public Gato(String raca, String nome, int idade) {
        super(raca, nome, idade);
    }

    @Override
    public void Som(){
        System.out.println("Miau!");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();

    }
}
