package listaRicardo

import "fmt"

type Funcionario struct {
	Nome    string
	Salario float64
}

func (f Funcionario) GetNome() string {
	return f.Nome
}

func (f Funcionario) GetSalario() float64 {
	return f.Salario
}

type FuncionarioHorista struct {
	Funcionario
	Horas float64
}

func (fh FuncionarioHorista) CalcularSalario() {
	salarioFinal := fh.GetSalario() * fh.Horas
	fmt.Printf("Salário do funcionário %s é R$: %.2f\n", fh.GetNome(), salarioFinal)
}

type FuncionarioAssalariado struct {
	Funcionario
}

func (fa FuncionarioAssalariado) CalcularSalario() {
	salarioNormal := fa.GetSalario()
	fmt.Printf("Salário do funcionário %s é R$: %.2f\n", fa.GetNome(), salarioNormal)
}

func main() {

	horista := FuncionarioHorista{
		Funcionario: Funcionario{Nome: "João", Salario: 50},
		Horas:       160,
	}
	horista.CalcularSalario()

	assalariado := FuncionarioAssalariado{
		Funcionario: Funcionario{Nome: "Maria", Salario: 5000},
	}
	assalariado.CalcularSalario()
}
