package listaRicardo

import "fmt"

func Somar(n1, n2 float64) float64 {
	resultado2 := n1 + n2
	fmt.Printf("A soma de dois números é: %.2f\n", resultado2)
	return resultado2
}

func SomarTres(n1, n2, n3 float64) float64 {
	resultado3 := n1 + n2 + n3
	fmt.Printf("A soma dos três números é: %.2f\n", resultado3)
	return resultado3
}

func main() {
	Somar(5, 7)
	SomarTres(1, 2, 3)
}
