from Cachorro import Cachorro
from Gato import Gato


class Animal:
    def __init__(self, raca, nome, idade):
        self.raca = raca
        self.nome = nome
        self.idade = idade

    def get_raca(self):
        return self.raca

    def set_raca(self, raca):
        self.raca = raca

    def get_nome(self):
        return self.nome

    def set_nome(self, nome):
        self.nome = nome

    def get_idade(self):
        return self.idade

    def set_idade(self, idade):
        self.idade = idade

    def mostrar_informacoes(self):
        print(f"Raça do animal: {self.raca}")
        print(f"Nome do animal: {self.nome}")
        print(f"Idade do animal: {self.idade}")

    def som(self):
        print("Som do animal.")

cachorro = Cachorro("Labrador", "Rex", 5)
gato = Gato("Siamês", "Felix", 3)

cachorro.mostrar_informacoes()
cachorro.som()

gato.mostrar_informacoes()
gato.som()