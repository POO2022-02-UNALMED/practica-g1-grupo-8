from gestorAplicacion.Hija.usuario import Usuario
from gestorAplicacion.Hija.tarjetaNegocioUsuario import TarjetaNegocioUsuario
from gestorAplicacion.Hija.contactosLocales import ContactosLocales
from baseDatos.Guardar import guardar
from baseDatos.Cargar import cargar
from framesFuncionalidades.ErrorAplicacion import ArchivoNoEncontrado, ErrorAplicacion

class CargarUsuario:
    usuario: Usuario

    @staticmethod
    def cargarUsuario():
        try:
            CargarUsuario.usuario = cargar()
        except ArchivoNoEncontrado as ex:
            print(ex)
            CargarUsuario.crearUsuario()

    @staticmethod
    def crearUsuario():
        try:
            print("Creando y almacenando usuario.")
            tarjetaNegocio = TarjetaNegocioUsuario("Facebook", "Red Social", "0000000000", "Calle 0 # 0 - 0")
            contactoLocal = ContactosLocales("Juan", "juan@email.com", "Juan Rios")
            usuario: Usuario = Usuario("Andres", "andres@email.com", "Andres Gomez", tarjetaNegocio.getNombreNegocio(),tarjetaNegocio.getDescripcionNegocio(), "Prohibido usar informacion falsa", tarjetaNegocio)
            usuario.setContactosLocales([contactoLocal])
            guardar(usuario)
        except ErrorAplicacion as ex:
            print(ex)

    @staticmethod
    def guardarUsario(cls):
        try:
            guardar(CargarUsuario.usuario)
        except ErrorAplicacion as ex:
            print(ex)
    

    