package listaRicardo

import "fmt"

type Cachorro struct {
	Animal
}

func (c *Cachorro) Som() {
	fmt.Println("Au Au au!")
}
