class Carro:
    def __init__(self,marca,modelo,ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def acelerar(self,incremento):
        self.velocidade += incremento
        print(f"Acelerando... Velocidade atual: {self.velocidade} km/h")


    def frear(self,decremento):
        self.velocidade -= decremento
        if self.velocidade < 0:
            self.velocidade = 0
        print(f"Freando... Velocidade atual:  {self.velocidade} km/h")


    def mostrarVelocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h")

    def info(self):
        print(f"Marca do carro: {self.marca}")
        print(f"Modelo do carro: {self.modelo}")
        print(f"Ano do carro: {self.ano}")





if __name__ == "__main__":
    carro1 = Carro(marca= "fiat", modelo = "mobi" ,ano=2024)
    carro2 = Carro(marca="VW", modelo="polo", ano=2023)
    carro3 = Carro(marca="honda", modelo="civic", ano=2021)

    carro1.info()
    carro2.info()
    carro3.info()

    carro1.acelerar(100)
    carro1.frear(50)
    carro1.mostrarVelocidade()