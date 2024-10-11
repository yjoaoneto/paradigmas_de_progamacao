class Professor:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        self.escola = None

    def get_nome(self):
        return self.nome

    def set_nome(self, nome):
        self.nome = nome

    def get_idade(self):
        return self.idade

    def set_idade(self, idade):
        self.idade = idade

    def get_escola(self):
        return self.escola

    def set_escola(self, escola):
        self.escola = escola

    def mostrar_escola(self):
        if self.escola:
            print(f"A escola {self.escola.get_nome()} contratou o professor {self.nome}")
        else:
            print(f"{self.nome} não trabalha nesta escola.")
