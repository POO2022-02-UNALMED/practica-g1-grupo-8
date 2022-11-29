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

    def setMensajes(self, mensaje):
        self._mensajes.append(mensaje)

    def __str__(self):
        return super.__str__()