from abc import ABC, abstractmethod

class InterfaceTexto(ABC):
    @abstractmethod
    def mostrar_texto(self):
        pass