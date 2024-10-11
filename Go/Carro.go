package listaRicardo

import "fmt"

type Carro struct {
	Marca      string
	Modelo     string
	Ano        int
	Velocidade int
	Motor      Motor
}

func (c *Carro) Acelerar(incremento int) {
	c.Velocidade += incremento
	fmt.Printf("Acelerando... Velocidade atual: %d km/h\n", c.Velocidade)
}

func (c *Carro) Frear(decremento int) {
	c.Velocidade -= decremento
	if c.Velocidade < 0 {
		c.Velocidade = 0
	}
	fmt.Printf("Freando... Velocidade atual: %d km/h\n", c.Velocidade)
}

func (c Carro) MostrarVelocidade() {
	fmt.Printf("Velocidade atual: %d km/h\n", c.Velocidade)
}

func (c Carro) Info() {
	fmt.Printf("Marca do carro: %s\n", c.Marca)
	fmt.Printf("Modelo do carro: %s\n", c.Modelo)
	fmt.Printf("Ano do carro: %d\n", c.Ano)
	c.Motor.InfosMotor()
}

func main() {
	motor := Motor{Estado: "bom", Potencia: 150.0}
	carro := Carro{Marca: "Ford", Modelo: "Mustang", Ano: 2020, Motor: motor}

	carro.Acelerar(50)
	carro.MostrarVelocidade()
	carro.Frear(20)
	carro.MostrarVelocidade()
	carro.Info()
}
