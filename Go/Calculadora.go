package listaRicardo

import "fmt"

func somarDois(n1, n2 float64) float64 {
	return n1 + n2
}

func somarTres(n1, n2, n3 float64) float64 {
	return n1 + n2 + n3
}

func main() {

	resultado2 := somarDois(10, 20)
	fmt.Println("Soma de dois números:", resultado2)

	resultado3 := somarTres(5, 7, 9)
	fmt.Println("Soma de três números:", resultado3)
}
