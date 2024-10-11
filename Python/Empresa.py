class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def add_empregado(self, empregado):
        self.empregados.append(empregado)

    def apresentar_empregados(self):
        print(f"{self.nome} tem os seguintes funcionários:")
        for empregado in self.empregados:
            empregado.info_empregado()