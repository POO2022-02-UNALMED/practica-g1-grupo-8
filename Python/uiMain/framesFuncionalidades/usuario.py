from contactoUsuario import ContactoUsuario
from tarjetaNegocioUsuario import TarjetaNegocioUsuario
from contactosLocales import ContactosLocales
from contactosPendientes import ContactosPendientes
from mensajeNegocio import MensajeNegocio
from MensajeSocial import MensajeSocial

#Describe al usuario del programa
class Usuario:
    _contactoUsuario: ContactoUsuario
    _tarjetaNegocioUsuario: TarjetaNegocioUsuario
    _contactosLocales: list[ContactosLocales]
    _contactosPendientes: list[ContactosPendientes]

    #Genera al Usuario y crea su ContactoUsuario
    def __init__(self, nombre="Nombre",email="Email",nombreCompleto="Nombre completo",logoNegocio="logo",descripcionNegocio="descripcion",terminosNegocio="terminos") -> None:
        self._contactoUsuario = ContactoUsuario(nombre, email, nombreCompleto, logoNegocio, descripcionNegocio, terminosNegocio)
        self._contactosLocales = [],
        self._contactosPendientes = []

    #Añade un nuevo contacto al array de contactos pendites
    def crearNuevoContacto(self, nombre: str, email: str, nombreCompleto: str) -> None:
        #Llama al metodo de clase crear contacto de pendientes que devuelve un contacto
        self._contactosPendientes.append(ContactosPendientes(nombre, email, nombreCompleto))

    #Depende del metodo empezarChat para optener el indice del contacto
	#vuele un contacto pendiente en local
    def volverContactoLocal(self, indice: int) -> None: 
        contactosPendientes: ContactosPendientes = self._contactosPendientes[indice]
        self._contactosLocales = ContactosLocales(contactosPendientes.getNombre(), contactosPendientes.getEmail(), contactosPendientes.getNombreCompleto())
        self._contactosPendientes.remove(contactosPendientes)

    #le agrega un mensaje de negocios al contacto local recien creado
    def anadirMensajeNegocio(self, titulo: str, cuerpo: str) -> None:
        ultimoContactoCreado: ContactosLocales = self._contactosLocales[self._contactosLocales.count() - 1]
        ultimoContactoCreado.getMensajes().append(
            MensajeNegocio(
                titulo, 
                cuerpo, 
                self._contactoUsuario.getLogoNegocio(),
                self._contactoUsuario.getDescripcionNegocio(),
                self._contactoUsuario.getTerminosNegocio(),
                self._contactoUsuario.getNombreCompleto(),
                ultimoContactoCreado.getNombreCompleto()
                )
        )

    #le agrega un mensaje social al contacto local recien creado
    def anadirMensajeSocial(self, titulo: str, cuerpo: str) -> None:
        ultimoContactoCreado: ContactosLocales = self._contactosLocales[self._contactosLocales.count() - 1]
        ultimoContactoCreado.getMensajes().append(
            MensajeSocial(
                titulo, 
                cuerpo, 
                self._contactoUsuario.getNombreCompleto(),
                ultimoContactoCreado.getNombreCompleto()
                )
        )
    
    #
    def mostrarChats(self) -> str:
        texto: str = ""
        for contactoLocal in self._contactosLocales:
            texto += "email: " + contactoLocal.getEmail() + "\n"
            texto += "Mensajes: " + "\n"
            for mensajes in contactoLocal.getMensajes():
                texto += mensajes + "\n"

        return texto

    #Devuelve en contacto pendiente en la pocision i
    def getContactoPendiente(self, indice: int) -> ContactosPendientes:
        return self._contactosPendientes[indice]

    #Devuelve en contacto local en la pocision i
    def getContactoLocal(self, indice: int) -> ContactosLocales:
        return self._contactosLocales[indice]

    def getContactoUsuario(self) -> ContactoUsuario:
        return self._contactoUsuario

    def setContactoUsuario(self, contactoUsuario: ContactoUsuario) -> None:
        self._contactoUsuario = contactoUsuario

    def getContactosLocales(self) -> list[ContactosLocales]:
        return self._contactosLocales

    def setContactosLocales(self, contactosLocales: ContactosLocales) -> None:
        self._contactosLocales = contactosLocales

    def getContactosPendientes(self) -> list[ContactosPendientes]:
        return self._contactosPendientes

    def setContactosPendientes(self, contactosPendientes: ContactosPendientes) -> None:
        self._contactosPendientes = contactosPendientes

    def getTarjetaNegocio(self) -> TarjetaNegocioUsuario:
        return self._tarjetaNegocioUsuario
    
    def setTarjetaNegocioUsuario(self, tarjetaNegocioUsuario: TarjetaNegocioUsuario) -> None:
        self._tarjetaNegocioUsuario = tarjetaNegocioUsuario

    def __str__(self) -> str:
        return "Usuario {" + "contactoUsuario=" + self.getContactoUsuario() + ",\ntarjetaNegocioUsuario=" + self.getTarjetaNegocio().__str__() + ",\ncontactosLocales=" + self.getContactosLocales().__str__() +",\ncontactosPendientes=" + self.getContactosPendientes().__str__() + '\n}'



            


    
