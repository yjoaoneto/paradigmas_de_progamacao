public class Escola {

    private String nome;
    private String endereco;
    private Professor professor;

    public Escola(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void mostrarProfessor(){
        if (professor != null)
            System.out.println("O professor "+professor.getNome()+ " está lecionando na escola "+ this.nome);
        else
            System.out.println(this.nome+" ainda não contratou tal professor. ");

    }





}
