package listaRicardo

import "fmt"

func Fatorial(n int) int {
	if n == 0 || n == 1 {
		return 1
	}
	return n * Fatorial(n-1)
}

func main() {

	fmt.Println(Fatorial(5))
}
