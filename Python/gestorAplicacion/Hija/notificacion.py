class Notificacion:

    def __init__(self, titulo: str, cuerpo: str) -> None:
        self._titulo = titulo
        self._cuerpo = cuerpo

    def getTitulo(self) -> str:
        return self._titulo

    def getCuerpo(self) -> str:
        return self._cuerpo

    def __str__(self) -> str:
       return "Notificacion [titulo=" + self.getTitulo() + ",\ncuerpo=" + self.getCuerpo() + "\n]"