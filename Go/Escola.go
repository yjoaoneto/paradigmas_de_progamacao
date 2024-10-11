package listaRicardo

import "fmt"

type Escola struct {
	Nome      string
	Endereco  string
	Professor *Professor
}

func (e *Escola) GetNome() string {
	return e.Nome
}

func (e *Escola) SetNome(nome string) {
	e.Nome = nome
}

func (e *Escola) GetEndereco() string {
	return e.Endereco
}

func (e *Escola) SetEndereco(endereco string) {
	e.Endereco = endereco
}

func (e *Escola) GetProfessor() *Professor {
	return e.Professor
}

func (e *Escola) SetProfessor(professor *Professor) {
	e.Professor = professor
}

func (e *Escola) MostrarProfessor() {
	if e.Professor != nil {
		fmt.Printf("O professor %s está lecionando na escola %s\n", e.Professor.GetNome(), e.Nome)
	} else {
		fmt.Printf("%s ainda não contratou tal professor.\n", e.Nome)
	}
}
