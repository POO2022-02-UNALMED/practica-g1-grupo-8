from gestorAplicacion.Padre.Mensaje import Mensaje
class MensajeSocial(Mensaje):

    def __init__(self, titulo: str, cuerpo: str, nombreA: str, nombreB: str):
        super().__init__(titulo, cuerpo)
        self._nombreA = nombreA
        self._nombreB = nombreB

    def getNombreA(self):
        return self._nombreA

    def getNombreB(self):
        return self._nombreB

    def __str__(self) -> str:
        return "MensajeSocial [titulo=" + self.getTitulo() + ", cuerpo=" + self.getCuerpo() + ", nombreA=" + self.getNombreA() + ", nombreB=" + self.getNombreB() + "]"