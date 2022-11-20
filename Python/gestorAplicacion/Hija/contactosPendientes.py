#Los contactos pendientes son personas con las que no se a iniciado un conversacion.

class ContactosPendientes(Contacto):

        
        
    #Crea el contacto sin mensajes
    def __init__(self, nombre, email, nombreCompleto):
        super().__init__(nombre, email, nombreCompleto)
        self._mensajes = "No hay mensajes"

    def getMensajes(self):
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
