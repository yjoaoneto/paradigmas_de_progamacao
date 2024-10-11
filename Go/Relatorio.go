package listaRicardo

import "fmt"

type Relatorio struct {
	Conteudo string
}

// Método que implementa MostrarTexto para Relatorio
func (r Relatorio) MostrarTexto() {
	fmt.Printf("Conteúdo do relatório:\n%s\n", r.Conteudo)
}
