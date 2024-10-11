class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super(Configuracao, cls).__new__(cls)
            print("Instância da configuração criada.")
        return cls._instancia

    def mostrar_configuracao(self):
        print("Exibindo as configurações do sistema.")


config1 = Configuracao()
config2 = Configuracao()

config1.mostrar_configuracao()


print(config1 == config2)