class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def info_empregado(self):
        print(f"Nome do funcionário: {self.nome}")
        print(f"Cargo do funcionário: {self.cargo}")
        print(f"Salário do funcionário: R$ {self.salario}")