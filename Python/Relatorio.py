import InterfaceTexto


class Relatorio(InterfaceTexto):
    def __init__(self, conteudo):
        self.conteudo = conteudo

    def mostrar_texto(self):
        print(f"Conteúdo do relatório:\n{self.conteudo}")