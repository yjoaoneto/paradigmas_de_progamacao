package listaRicardo

import (
	"fmt"
)

type Produto struct {
	nome  string
	preco float64
}

func somar(produto1, produto2 Produto) Produto {
	return Produto{
		nome:  produto1.nome + " + " + produto2.nome,
		preco: produto1.preco + produto2.preco,
	}
}

func (p Produto) String() string {
	return fmt.Sprintf("Produto: %s, Preço: %.2f", p.nome, p.preco)
}

func main() {
	produto1 := Produto{"Produto A", 50.50}
	produto2 := Produto{"Produto B", 49.50}

	produtoSoma := somar(produto1, produto2)
	fmt.Println(produtoSoma.String())
}
