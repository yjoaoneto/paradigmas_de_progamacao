package listaRicardo

import "fmt"

type Gato struct {
	Animal
}

func (g *Gato) Som() {
	fmt.Println("Miau!")
}
