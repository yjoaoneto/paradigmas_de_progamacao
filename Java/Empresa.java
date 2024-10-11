import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    private List<Empregado> empregados;

    public Empresa(String nome){
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void addEmpregado(Empregado empregado){
        empregados.add(empregado);
    }

    public void apresentarEmpregados() {
        System.out.println(nome + " tem os seguintes funcionários: ");
        for (Empregado empregado : empregados) {
            empregado.infoEmpregado();
        }
    }
}
