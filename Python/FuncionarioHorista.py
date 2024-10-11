from Funcionario import Funcionario


class FuncionarioHorista(Funcionario):
    def __init__(self, nome, salario, horas):
        super().__init__(nome, salario)
        self.horas = horas

    def calcular_salario(self):
        salario_final = self.salario * self.horas
        print(f"Salário do funcionário {self.get_nome()} é R$: {salario_final}")

