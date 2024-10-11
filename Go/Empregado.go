package listaRicardo

import "fmt"

type Empregado struct {
	Nome    string
	Cargo   string
	Salario float64
}

func (e Empregado) InfoEmpregado() {
	fmt.Printf("Nome do funcionário: %s\n", e.Nome)
	fmt.Printf("Cargo do funcionário: %s\n", e.Cargo)
	fmt.Printf("Salário do funcionário: R$ %.2f\n", e.Salario)
}
