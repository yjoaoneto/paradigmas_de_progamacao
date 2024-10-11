public class Professor {

    private String nome;
    private int idade;
    private Escola escola;

    public Professor(String nome,int idade){
        this.nome = nome;
        this.idade = idade;

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

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public void mostrarEscola(){
        if (escola != null)
            System.out.println("A escola "+escola.getNome()+ " contratou o professor "+ this.nome);
        else
            System.out.println(this.nome+" não trabalha nesta escola. ");
    }
}
