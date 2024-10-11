class Calculadora:
    def __init__(self):
        pass

    def somar(self, n1, n2):
        resultado2 = n1 + n2
        print(f"A soma de dois números é: {resultado2}")
        return resultado2

    def somar_tres(self, n1, n2, n3):
        resultado3 = n1 + n2 + n3
        print(f"A soma dos três números é: {resultado3}")
        return resultado3

# Exemplo de uso
calc = Calculadora()
calc.somar(5, 7)
calc.somar_tres(1, 2, 3)