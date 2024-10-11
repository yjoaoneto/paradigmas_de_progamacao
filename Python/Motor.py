class Motor:
    def __init__(self, estado, potencia):
        self.estado = estado
        self.potencia = potencia

    def infos_motor(self):
        print(f"Motor está em {self.estado} estado")
        print(f"Potência do motor é de {self.potencia} cavalos")