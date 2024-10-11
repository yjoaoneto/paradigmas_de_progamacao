package listaRicardo

import "fmt"

type Configuracao struct{}

var instancia *Configuracao

func GetInstancia() *Configuracao {
	if instancia == nil {
		instancia = &Configuracao{}
		fmt.Println("Instância da configuração criada.")
	}
	return instancia
}

func (c *Configuracao) MostrarConfiguracao() {
	fmt.Println("Mostrar na tela as configurações do sistema.")
}

func main() {
	config1 := GetInstancia()
	config1.MostrarConfiguracao()

	config2 := GetInstancia()
	config2.MostrarConfiguracao()

	if config1 == config2 {
		fmt.Println("Ambas as instâncias são iguais.")
	}
}
