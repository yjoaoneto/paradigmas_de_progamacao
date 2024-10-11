from Funcionario import Funcionario


class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salario):
        super().__init__(nome, salario)

    def calcular_salario(self):
        salario_normal = self.get_salario()
        print(f"Salário do funcionário {self.get_nome()} é R$: {salario_normal}")

# Exemplos de us