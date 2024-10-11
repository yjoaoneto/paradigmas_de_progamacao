public class Cachorro extends Animal{

    public Cachorro(String raca, String nome, int idade) {
        super(raca, nome, idade);
    }

    @Override
    public void Som(){
        System.out.println("Au Au au!");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();

    }
}
