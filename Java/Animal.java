public class Animal {

    private String raca;
    private String nome;
    private int idade;

    public Animal(String raca, String nome, int idade){
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrarInformacoes(){
        System.out.println("Raça do animal: "+ this.raca);
        System.out.println("Nome do animal: "+ this.nome);
        System.out.println("Idade do animal: "+ this.idade);
    }

    public void Som(){
        System.out.println("Som do animal.");
    }

}
