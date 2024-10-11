package listaRicardo

import "fmt"

type Empresa struct {
	Nome       string
	Empregados []Empregado
}

func (e *Empresa) AddEmpregado(empregado Empregado) {
	e.Empregados = append(e.Empregados, empregado)
}

func (e Empresa) ApresentarEmpregados() {
	fmt.Printf("%s tem os seguintes funcionários:\n", e.Nome)
	for _, empregado := range e.Empregados {
		empregado.InfoEmpregado()
	}
}

func main() {
	emp1 := Empregado{Nome: "Ana", Cargo: "Engenheira", Salario: 5000.00}
	emp2 := Empregado{Nome: "Carlos", Cargo: "Analista", Salario: 3000.00}

	empresa := Empresa{Nome: "Tech Corp"}
	empresa.AddEmpregado(emp1)
	empresa.AddEmpregado(emp2)

	empresa.ApresentarEmpregados()
}
