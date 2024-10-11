import InterfaceTexto

class Contrato(InterfaceTexto):
    def __init__(self, assinante, valor_contrato):
        self.assinante = assinante
        self.valor_contrato = valor_contrato

    def mostrar_texto(self):
        print(f"Assinante do contrato: {self.assinante}")
        print(f"Valor do contrato: R$ {self.valor_contrato}")