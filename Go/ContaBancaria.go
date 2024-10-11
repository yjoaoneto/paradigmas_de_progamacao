package listaRicardo

import "fmt"

type ContaBancaria struct {
	Saldo   float32
	Titular string
}

func (c *ContaBancaria) SetSaldo(saldo float32) {
	c.Saldo = saldo
}

func (c *ContaBancaria) GetSaldo() float32 {
	return c.Saldo
}

func (c *ContaBancaria) SetTitular(titular string) {
	c.Titular = titular
}

func (c *ContaBancaria) GetTitular() string {
	return c.Titular
}

func (c *ContaBancaria) Depositar(valor float32) {
	c.Saldo += valor
}

func (c *ContaBancaria) Sacar(valor float32) {
	c.Saldo -= valor
}

func (c *ContaBancaria) MostrarSaldo() {
	fmt.Printf("O saldo atual é de: %.2f\n", c.Saldo)
}

func main() {
	conta := ContaBancaria{Saldo: 1000.0, Titular: "João"}

	conta.Depositar(500)
	conta.MostrarSaldo()

	conta.Sacar(200)
	conta.MostrarSaldo()
}
