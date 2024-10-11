package listaRicardo

import "fmt"

type Animal struct {
	raca  string
	nome  string
	idade int
}

func (a *Animal) GetRaca() string {
	return a.raca
}

func (a *Animal) SetRaca(raca string) {
	a.raca = raca
}

func (a *Animal) GetNome() string {
	return a.nome
}

func (a *Animal) SetNome(nome string) {
	a.nome = nome
}

func (a *Animal) GetIdade() int {
	return a.idade
}

func (a *Animal) SetIdade(idade int) {
	a.idade = idade
}

func (a *Animal) MostrarInformacoes() {
	fmt.Println("Raça do animal:", a.raca)
	fmt.Println("Nome do animal:", a.nome)
	fmt.Println("Idade do animal:", a.idade)
}

func (a *Animal) Som() {
	fmt.Println("Som do animal.")
}

func main() {
	cachorro := Cachorro{Animal{"Labrador", "Rex", 5}}
	gato := Gato{Animal{"Siamês", "Felix", 3}}

	cachorro.MostrarInformacoes()
	cachorro.Som()

	gato.MostrarInformacoes()
	gato.Som()
}
