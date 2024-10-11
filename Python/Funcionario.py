from abc import ABC, abstractmethod

from FuncionarioAssalariado import FuncionarioAssalariado
from FuncionarioHorista import FuncionarioHorista


# Classe abstrata Funcionario
class Funcionario(ABC):
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario

    @abstractmethod
    def calcular_salario(self):
        pass

    def get_nome(self):
        return self.nome

    def get_salario(self):
        return self.salario

horista = FuncionarioHorista("João", 50, 160)
horista.calcular_salario()  # Saída: Salário do funcionário João é R$: 8000

assalariado = FuncionarioAssalariado("Maria", 5000)
assalariado.calcular_salario() 