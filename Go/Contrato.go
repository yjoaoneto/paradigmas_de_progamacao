package listaRicardo

import "fmt"

type Contrato struct {
	Assinante     string
	ValorContrato float64
}

func (c Contrato) MostrarTexto() {
	fmt.Printf("Assinante do contrato: %s\n", c.Assinante)
	fmt.Printf("Valor do contrato: R$ %.2f\n", c.ValorContrato)
}

func main() {
	contrato := Contrato{Assinante: "João", ValorContrato: 1500.00}
	contrato.MostrarTexto()

	relatorio := Relatorio{Conteudo: "Este é o conteúdo do relatório."}
	relatorio.MostrarTexto()
}
