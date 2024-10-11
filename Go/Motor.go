package listaRicardo

import "fmt"

type Motor struct {
	Estado   string
	Potencia float64
}

func (m Motor) InfosMotor() {
	fmt.Printf("Motor está em %s estado\n", m.Estado)
	fmt.Printf("Potência do motor é de %.2f cavalos\n", m.Potencia)
}
