#Es un mensaje formal, tiene informacion sobre el negocio del usuario
class MensajeNegocio(Mensaje):
    #No permite crear mensajes con campos vacios
    def __init__(self, titulo, cuerpo, logo, descripcion, termino, nombreCompletoA, nombreCompletoB):
        super.__init__(titulo, cuerpo)
        self._logo = logo
        self._descripcion = descripcion
        self._termino = termino
        self._nombreCompletoA = nombreCompletoA
        self._nombreCompletoB = nombreCompletoB

    def __str__(self):
        return "MensajeNegocios [titulo=" + self.getTitulo() + ", cuerpo=" + self.getCuerpo() + ", logo=" + self._logo + ", descripcion=" + self._descripcion + ", termino=" + self._termino + ", nombreCompletoA=" + self._nombreCompletoA + ", nombreCompletoB=" + self._nombreCompletoB + "]"

    def getLogo(self):
        return self._logo

    def setLogo(self, logo):
        self._logo = logo
        
    def getDescripcion(self):
        return self._descripcion
        
    def setDescripcion(self, descripcion):
        self._descripcion = descripcion
        
    def getTermino(self):
        return self._termino
        
    def setTermino(self, termino):
        self._termino = termino
        
    def getNombreCompletoA(self):
        return self._nombreCompletoA
        
    def setNombreCompletoA(self, nombreCompletoA):
        self._nombreCompletoA = nombreCompletoA
        
    def getNombreCompletoB(self):
        return self._nombreCompletoB
        
    def setNombreCompletoB(self, nombreCompletoB):
        self._nombreCompletoB = nombreCompletoB