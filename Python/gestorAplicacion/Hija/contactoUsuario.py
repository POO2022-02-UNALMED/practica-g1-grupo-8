from Padre.Contacto import Contacto
from notificacion import Notificacion
#Contacto del Usuario guarda sus datos y sus notificaciones
class ContactoUsuario(Contacto):
    #Guarda la informacion del Usuario
    def __init__(self, nombre, email, nombreCompleto, logoNegocio = "", descripcionNegocio = "", terminosNegocio = ""):
        super.__init__(nombre, email, nombreCompleto)
        self._logoNegocio = logoNegocio
        self._descripcionNegocio = descripcionNegocio
        self._terminosNegocio = terminosNegocio
        self._notificaciones = []

    #agrega una nueva notificacion al Contacto de Usuario
    def anadirNotificaciones(self, titulo, cuerpo):
        self._notificaciones.append(Notificacion(titulo, cuerpo))
	
    def __str__(self):
        if (self._logoNegocio != ""):
            return super.__str__() + "\nContactoUsuario [logoNegocio=" + self._logoNegocio + ", descripcionNegocio=" + self._descripcionNegocio + ", terminosNegocio=" + self._terminosNegocio + "]"
		
        else:
            return super.__str__()
		
    def getLogoNegocio(self):
        return self._logoNegocio

    def setLogoNegocio(self, logoNegocio):
        self._logoNegocio = logoNegocio

    def getDescripcionNegocio(self):
        return self._descripcionNegocio

    def setDescripcionNegocio(self, descripcionNegocio):
        self._descripcionNegocio = descripcionNegocio

    def getTerminosNegocio(self):
        return self._terminosNegocio

    def setTerminosNegocio(self, terminosNegocio):
        self._terminosNegocio = terminosNegocio

    def getNotificaciones(self):
        return self.notificaciones

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