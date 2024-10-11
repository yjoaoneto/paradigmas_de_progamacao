package listaRicardo

import "fmt"

type Professor struct {
	Nome   string
	Idade  int
	Escola *Escola
}

func (p *Professor) GetNome() string {
	return p.Nome
}

func (p *Professor) SetNome(nome string) {
	p.Nome = nome
}

func (p *Professor) GetIdade() int {
	return p.Idade
}

func (p *Professor) SetIdade(idade int) {
	p.Idade = idade
}

func (p *Professor) GetEscola() *Escola {
	return p.Escola
}

func (p *Professor) SetEscola(escola *Escola) {
	p.Escola = escola
}

func (p *Professor) MostrarEscola() {
	if p.Escola != nil {
		fmt.Printf("A escola %s contratou o professor %s\n", p.Escola.GetNome(), p.Nome)
	} else {
		fmt.Printf("%s não trabalha nesta escola.\n", p.Nome)
	}
}
