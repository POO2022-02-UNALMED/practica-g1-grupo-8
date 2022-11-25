
#Serializable 
class Mensaje:

    #_SERIALVERSIONUID = 1

    def __init__(self, titulo, cuerpo):
        self.titulo = titulo
        self.cuerpo = cuerpo

    def getTitulo(self):
        return self.titulo

    def setTitulo(self, titulo):
        self.titulo = titulo

    def getCuerpo(self):
        return self.cuerpo

    def setCuerpo(self, cuerpo):
        self.cuerpo = cuerpo
