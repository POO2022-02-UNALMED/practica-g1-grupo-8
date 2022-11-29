from gestorAplicacion.Padre.Contacto import Contacto
from gestorAplicacion.Padre.Mensaje import Mensaje
#Los contactos locales son personas con las que ya se inicio una convesacion
class ContactosLocales(Contacto):

    _mensajes: list[Mensaje]
    #Genera los contactos locales con la capacidad de recibir mensajes
    def __init__(self, nombre, email, nombreCompleto):
        super().__init__(nombre, email, nombreCompleto)
        self._mensajes = []

    def getMensajes(self) -> list[Mensaje]:
        return self._mensajes

    def setMensajes(self, mensajes):
        self._mensajes = mensajes

    def __str__(self):
        return super.__str__()

    def getNombre(self):
        return super.getNombre()
    
    def setNombre(self, nombre):
        super.setNombre(nombre)

    def getEmail(self):
        return super.getEmail()
    
    def setEmail(self, email):
        super.setEmail(email)
    
    def getNombreCompleto(self):
        return super.getNombreCompleto()
    
    def setNombreCompleto(self, nombreCompleto):
        super.setNombreCompleto(nombreCompleto)