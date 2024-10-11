import SaldoInsuficienteException
class ContaBancaria2:
    def __init__(self, saldo_inicial):
        self.saldo = saldo_inicial

    def sacar(self, quantia):
        if quantia > self.saldo:
            raise SaldoInsuficienteException(f"Saldo insuficiente para saque de {quantia}.")
        self.saldo -= quantia
        print(f"Saque de {quantia} realizado. Saldo restante: {self.saldo}")

# Exemplo de uso
conta = ContaBancaria2(1000.0)

try:
    conta.sacar(1500.0)  # Tentativa de saque acima do saldo
except SaldoInsuficienteException as e:
    print(e)  # Saída: Saldo insuficiente para saque de 1500.0.

try:
    conta.sacar(500.0)  # Saque dentro do saldo
except SaldoInsuficienteException as e:
    print(e)