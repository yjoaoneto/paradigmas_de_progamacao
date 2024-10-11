from Professor import Professor


class Escola:
    def __init__(self, nome, endereco):
        self.nome = nome
        self.endereco = endereco
        self.professor = None

    def get_nome(self):
        return self.nome

    def set_nome(self, nome):
        self.nome = nome

    def get_endereco(self):
        return self.endereco

    def set_endereco(self, endereco):
        self.endereco = endereco

    def get_professor(self):
        return self.professor

    def set_professor(self, professor):
        self.professor = professor

    def mostrar_professor(self):
        if self.professor:
            print(f"O professor {self.professor.get_nome()} está lecionando na escola {self.nome}")
        else:
            print(f"{self.nome} ainda não contratou tal professor.")


if __name__ == "__main__":
    professor = Professor("Carlos", 40)
    escola = Escola("Escola ABC", "Rua XYZ, 123")

    professor.set_escola(escola)
    escola.set_professor(professor)

    professor.mostrar_escola()
    escola.mostrar_professor()
