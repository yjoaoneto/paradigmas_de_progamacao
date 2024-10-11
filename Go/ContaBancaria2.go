package listaRicardo

import (
	"errors"
	"fmt"
)

type ContaBancaria2 struct {
	Saldo float64
}

func (c *ContaBancaria2) Sacar(quantia float64) error {
	if quantia > c.Saldo {
		return errors.New(fmt.Sprintf("Saldo insuficiente para saque de R$ %.2f", quantia))
	}
	c.Saldo -= quantia
	fmt.Printf("Saque de R$ %.2f realizado. Saldo restante: R$ %.2f\n", quantia, c.Saldo)
	return nil
}

func (c *ContaBancaria2) GetSaldo() float64 {
	return c.Saldo
}

func main() {
	conta := ContaBancaria2{Saldo: 500.0}

	err := conta.Sacar(600)
	if err != nil {
		fmt.Println(err)
	} else {
		conta.Sacar(300)
	}

	fmt.Printf("Saldo atual: R$ %.2f\n", conta.GetSaldo())
}
